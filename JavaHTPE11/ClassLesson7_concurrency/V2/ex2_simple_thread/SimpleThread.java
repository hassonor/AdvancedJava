package JavaHTPE11.ClassLesson7_concurrency.V2.ex2_simple_thread;

public class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);

    }

    public void run() {
        try {
            sleep(500);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            //System.out.println(i);

            System.out.print("===" + "===" + ">");
            System.out.println(getName());

            try {
                //sleep(1);
                sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("==================================DONE! " + getName());
    }
}

