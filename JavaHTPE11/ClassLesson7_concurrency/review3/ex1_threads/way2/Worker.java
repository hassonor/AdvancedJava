package JavaHTPE11.ClassLesson7_concurrency.review3.ex1_threads.way2;

public class Worker implements Runnable {


    private String name;

    public Worker(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0; i < 20;i++){
            System.out.println("Worker: " + name + " Num: " + i);
        }

    }
}
