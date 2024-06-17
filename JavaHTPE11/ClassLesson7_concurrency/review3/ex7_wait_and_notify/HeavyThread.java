package JavaHTPE11.ClassLesson7_concurrency.review3.ex7_wait_and_notify;

public class HeavyThread extends Thread {
    private Monitor m;
    private int num;


    public HeavyThread(Monitor m, int num){
        this.m = m;
        this.num =num;
    }

    @Override
    public void run(){
        m.waitForMyTurn(num);
        System.out.println("Thread num: " + num);
        m.iAmDone();

    }
}
