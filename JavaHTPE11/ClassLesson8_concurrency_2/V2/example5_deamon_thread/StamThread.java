package JavaHTPE11.ClassLesson8_concurrency_2.V2.example5_deamon_thread;

class StamThread extends Thread {
    public void run() {
        for (int i = 0; ; i++) {

            System.out.println(i);

        }
    }
}