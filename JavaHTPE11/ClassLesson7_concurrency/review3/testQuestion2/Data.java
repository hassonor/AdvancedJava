package JavaHTPE11.ClassLesson7_concurrency.review3.testQuestion2;

public class Data {
    private double[] cells;
    private double max;
    public Data(int size, double max){
        this.max = max;
        cells = new double[size];
        for(int i = 0; i < size;i++){
            cells[i] = Math.random()*max;
        }
    }

    public synchronized void multiply(int index, int val){
        while(cells[index] * val >= max){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        cells[index] = cells[index] * val;
    }

    public synchronized void divide(int index, int val){
        if(val > 0) {
            cells[index] = cells[index] / val;
            notifyAll();
        }
    }
}
