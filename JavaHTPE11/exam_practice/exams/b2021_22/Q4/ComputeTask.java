package JavaHTPE11.exam_practice.exams.b2021_22.Q4;

public class ComputeTask extends Thread{
    private int[] arr;
    private boolean isFinished = false;
    private int sum;


    public ComputeTask(int[] arr){
        this.arr = arr;
    }

    @Override
    public void run(){
        int sum = 0;
        for(int i =0;i < arr.length;i++)
            sum+=arr[i];

        synchronized(this){
            sum(sum);
            isFinished = true;
            notifyAll();
        }
    }

    public synchronized void sum(int sum){
        this.sum +=sum;
    }

    public synchronized int getSum(){
        while(!isFinished){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        return sum;
    }

}
