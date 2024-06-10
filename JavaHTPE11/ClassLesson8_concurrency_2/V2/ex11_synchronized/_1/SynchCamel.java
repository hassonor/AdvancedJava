package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex11_synchronized._1;

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


