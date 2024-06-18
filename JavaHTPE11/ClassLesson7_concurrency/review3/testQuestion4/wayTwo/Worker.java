package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion4.wayTwo;

public class Worker extends Thread {
    private int id;
    private Work w;

    public Worker(int id, Work w){
        this.id = id;
        this.w = w;
    }

    @Override
    public void run(){
        w.stage1(id);
        w.stage2(id);
    }
}
