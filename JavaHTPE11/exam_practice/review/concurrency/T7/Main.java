package JavaHTPE11.exam_practice.review.concurrency.T7;


public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        UpdateTask[] updateTask = new UpdateTask[10];
        printArray(d);

        for (int i = 0; i < 10; i++) {
            updateTask[i] = new UpdateTask(d);
        }
        for (int i = 0; i < 10; i++) {
            updateTask[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                updateTask[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printArray(d);

    }

    private static void printArray(Data d) {
        for (int i = 0; i < 100; i++) {
            System.out.print(d.get(i) + ",");
        }
        System.out.println();
    }

}
