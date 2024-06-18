package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion3;

public class Garage {
    int free;

    boolean[] parks;

    public Garage(int size){
        free = size;
        parks = new boolean[size];
    }

    public synchronized int park(){
        while(free == 0){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        for(int i = 0; i < parks.length;i++){
            if(!parks[i]){
                free--;
                parks[i] = true;
                return i;
            }
        }
        return -1;
    }

    public synchronized void release(int numOfPark){
        parks[numOfPark] = false;
        free++;
        notifyAll();
    }


}
