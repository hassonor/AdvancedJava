package JavaHTPE11.exam_practice.exams.b2021_74.Q4.A;


public class Main{
    public static void main(String[] args){
        Data d = new Data();
        UpdateTask[] tasks = new UpdateTask[10];

        showArrayOfData(d);

        for(int i= 0; i < 10;i++){
            tasks[i] = new UpdateTask(d);
        }

        for(int i =0; i < 10;i++){
            tasks[i].start();
        }

        for(int i = 0; i < 10;i++){
            try {
                tasks[i].join();
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

