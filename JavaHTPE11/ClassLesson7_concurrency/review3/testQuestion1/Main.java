package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion1;

public class Main {
    public static void main(String[] args){
        Manager m = new Manager(10);
        CoinThread[] cts = new CoinThread[10];

        for(int i = 0; i < 10; i++){
            cts[i] = new CoinThread(i,m);
        }

        for(int i = cts.length-1;i>=0;i--){
            cts[i].start();
        }

        m.allDone();
        System.out.println("MAIN DONE");
    }
}