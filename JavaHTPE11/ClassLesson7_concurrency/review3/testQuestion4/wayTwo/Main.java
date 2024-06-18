package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion4.wayTwo;

public class Main {
    public static void main(String[] args){
        Work w = new Work(10);
        Worker[] workers  = new Worker[10];

        for(int i= 0; i < workers.length;i++){
            workers[i] = new Worker(i,w);
        }
        for(int i =workers.length-1;i>=0;i--){
            workers[i].start();
        }


        for(int i= 0; i < workers.length;i++){
            try{
                workers[i].join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            };
        }

        System.out.println("MAIN DONE");
    }
}
