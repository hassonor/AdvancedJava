package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion4.wayTwo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Work {
    private int size;

    private int done;

    public Work(int size){
        this.size =size;
    }
    public void stage1(int id){
            System.out.println("worker " + id + " finished stage 1");
            synchronized (this) {
                done++;
                if(done == size)
                    notifyAll();
            }
    }

    public void stage2(int id){
        synchronized (this) {
            while(done != size){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("worker " + id + " finished stage 2");
    }
}
