package JavaHTPE11.exam_practice.exams.b2021_74.Q4.B;


public class Main{
    public static void main(String[] args){
        Data d = new Data();
        Thread[] ts  = new Thread[10];

        showArrayOfData(d);

        for(int i= 0; i < 10;i++){
            ts[i] = new Thread(new UpdateTask(d));
        }

        for(int i =0; i < 10;i++){
            ts[i].start();
        }

        for(int i = 0; i < 10;i++){
            try {
                ts[i].join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        showArrayOfData(d);

    }

    private static void showArrayOfData(Data d){
        for(int i=0; i < 100;i++){
            System.out.print(d.get(i) + ",");
        }
        System.out.println("");
    }
}

