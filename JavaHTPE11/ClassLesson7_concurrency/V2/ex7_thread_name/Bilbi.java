package JavaHTPE11.ClassLesson7_concurrency.V2.ex7_thread_name;

class Bilbi implements Runnable {
    private int i;
    private boolean cont = true;

    public void run() {
        i = 0;
        while (cont) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i++);
            if (i % 7 == 0) {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
            }
            if (i == 1000)
                stopThread();
        }
    }

    public void stopThread() {
        cont = false;
    }

}
