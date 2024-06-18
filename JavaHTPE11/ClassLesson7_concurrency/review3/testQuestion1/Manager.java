package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion1;

public class Manager{
    int nextTurn = 0;
    int size;

    public Manager(int size){
        this. size = size;
    }

    public synchronized void waitForMyTurn(int num){
        while(num > nextTurn){
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
        notifyAll();
    }


    public synchronized void allDone(){
        while(nextTurn != size){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}