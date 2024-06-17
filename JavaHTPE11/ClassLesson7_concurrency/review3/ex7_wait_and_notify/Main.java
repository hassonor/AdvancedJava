package JavaHTPE11.ClassLesson7_concurrency.review3.ex7_wait_and_notify;

public class Main {
    public static void main(String[] args){
        Monitor m = new Monitor(10);
        HeavyThread[] workers = new HeavyThread[10];

        for(int i = 0; i < 10;i++){
            workers[i] = new HeavyThread(m,i);
        }

        for(int i = workers.length -1; i>=0;i--){
            workers[i].start();
        }

        m.allDone();

        System.out.println("MAIN DONE");
    }
}
