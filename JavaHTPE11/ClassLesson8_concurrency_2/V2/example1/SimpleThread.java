package JavaHTPE11.ClassLesson8_concurrency_2.V2.example1;

public class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);


    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
            System.out.println(" " + getName());
        }
        System.out.println("DONE! " + getName());
    }
}

