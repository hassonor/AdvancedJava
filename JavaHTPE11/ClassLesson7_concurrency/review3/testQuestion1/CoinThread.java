package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion1;
public class CoinThread extends Thread{
    private int id;
    private Manager m;
    public CoinThread(int id, Manager m){
        this.id = id;
        this.m = m;
    }

    @Override
    public void run()
    {
        super.run();
        int head = 0, tail = 0;
        for(int i = 0 ; i < 100;i++){
            if(Math.random() < 0.5)
                head++;
            else
                tail++;
        }
        m.waitForMyTurn(id);
        System.out.println("Thread: " + id + " head: " + head + " tail: " + tail);
        m.iAmDone();
    }

}