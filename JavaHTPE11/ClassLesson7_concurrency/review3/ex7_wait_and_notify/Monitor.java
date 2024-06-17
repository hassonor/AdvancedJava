package JavaHTPE11.ClassLesson7_concurrency.review3.ex7_wait_and_notify;

public class Monitor {
    private int nextTurn = 2;
    private int size;

    private int done = 0;

    public Monitor(int size){
        this.size = size;
    }


    public synchronized void waitForMyTurn(int num){
        while(num >=nextTurn){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void iAmDone(){
        nextTurn++;
        done++;
        notifyAll();
    }

    public synchronized void allDone(){
        while(done != size){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
