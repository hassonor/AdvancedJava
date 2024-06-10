package JavaHTPE11.ClassLesson7_concurrency.V2.ex11_synchronized._1;

class SynchCamel extends Thread {
    public void run() {
        while (Synch.counter++ < 300) {
            //synchronized(Synch.counter)
            synchronized (Synch.aMonitor) {
                System.out.print("Ca");
                System.out.println("mel   ");
            }
        }
    }
}


