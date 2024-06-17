package JavaHTPE11.ClassLesson7_concurrency.review3.ex3_sleep;

public class Worker extends Thread{

    private String name;

    public Worker(String name){
        this.name = name;
    }


    @Override
    public void run(){
        super.run();
        for(int i = 0; i < 20;i++){
            System.out.println("Worker: " + name + " Num: " + i);
            try {
                sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
