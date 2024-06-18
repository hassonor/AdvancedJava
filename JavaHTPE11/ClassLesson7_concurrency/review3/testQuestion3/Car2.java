package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion3;

public class Car2 extends Thread{

    private final int TIME = 10000;
    private Garage g;

    public Car2(Garage g){
        this.g = g;
    }

    @Override
    public void run(){
        sleepFor();
        int n = g.park();
        sleepFor();
        g.release(n);
    }

    private void sleepFor(){
        try{
            sleep(TIME);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
