package JavaHTPE11.ClassLesson8_concurrency_2.V2.example5;

class StamThread extends Thread {
    public void run() {
        for (int i = 0; ; i++) {

            System.out.println(i);

        }
    }
}