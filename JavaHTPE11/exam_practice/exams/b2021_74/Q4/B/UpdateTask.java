package JavaHTPE11.exam_practice.exams.b2021_74.Q4.B;

public class UpdateTask implements Runnable{
    private Data data;

    public UpdateTask(Data d){
        data = d;
    }

    @Override
    public void run(){
        int index;
        for(int i =0; i < 100; i++){
            index = (int)(Math.random()*100);
            data.update(index);
            try{
                Thread.sleep((long)(Math.random()*100));
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}
