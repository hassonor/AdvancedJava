package JavaHTPE11.ClassLesson7_concurrency.V2.ex5_deamon_thread;

class StamThread extends Thread {
    public void run() {
        for (int i = 0; ; i++) {

            System.out.println(i);

        }
    }
}