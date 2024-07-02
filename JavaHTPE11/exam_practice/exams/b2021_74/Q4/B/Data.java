package JavaHTPE11.exam_practice.exams.b2021_74.Q4.B;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data{
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    private Lock[] lock;

    public Data(){
        lock = new Lock[100];
        for(int i =0; i < 100; i++){
            nums.add((int) (Math.random() * 100));
            lock[i] = new ReentrantLock();
        }


    }

    public void update(int i){
        lock[i].lock();
        try{
            int num = nums.get(i);
            if( num < 100) nums.set(i, num + 1);
            else nums.set(i,(int)(Math.random()*100));

        }
        finally{
            lock[i].unlock();
        }
    }

    public int get(int i){
        lock[i].lock();
        try{
            return nums.get(i);
        }
        finally{
            lock[i].unlock();
        }
    }
}

