package JavaHTPE11.classLesson10.testQuestion5_concurrency;

public class CoinTest {
    public static void main(String[] args){
        Coin[] threads = new Coin[10];
        int heads = 0,tails = 0, temp = 0;
        final int n  =100;
        for(int i = 0 ;i < 10;i++){
            threads[i] = new Coin(i+1,n);
            threads[i].start();
        }
        for(int i = 0;i < 10;i++){
            temp = threads[i].get();
            heads = heads + temp;
            tails = tails + (n-temp);
        }

        System.out.println("heads = " + heads);
        System.out.println("tails = " + tails);
        for(int i = 0; i< 10;i++){
            threads[i].finished();
        }
    }
}
