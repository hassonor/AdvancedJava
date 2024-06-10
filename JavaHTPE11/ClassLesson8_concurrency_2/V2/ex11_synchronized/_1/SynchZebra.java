package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex11_synchronized._1;

class SynchZebra extends Thread {
    public void run() {
        while (Synch.counter++ < 300) {
            synchronized (Synch.aMonitor) {
                System.out.print("Ze");
                System.out.println("bra   ");
            }
        }
    }
}