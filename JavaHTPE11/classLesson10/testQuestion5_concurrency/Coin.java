package JavaHTPE11.classLesson10.testQuestion5_concurrency;

public class Coin extends Thread {
    private int id;
    private int n;
    private boolean finished1 = false;
    private boolean finished2 = false;
    private int heads =0;

    public Coin(int i, int n){
        super(""+ i);
        id = i;
        this.n = n;
    }

    public synchronized int get(){
        while(!finished1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return heads;
    }
    public synchronized void finished(){
        finished2 = true;
        notifyAll();
    }

    @Override
    public void run(){
        create();
        waitHere();
        System.out.println(id);
    }

    private synchronized void create(){
        for(int i = 0; i < n;i++){
            if(Math.random() <=0.5) heads++;
        }

        finished1 = true;
        notifyAll();
    }

    private synchronized void waitHere(){
        while(!finished2){
            try{
                wait();
            }
            catch(InterruptedException e){

            }
        }
    }
}
