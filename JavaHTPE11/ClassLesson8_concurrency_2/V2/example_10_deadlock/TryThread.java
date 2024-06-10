package JavaHTPE11.ClassLesson8_concurrency_2.V2.example_10_deadlock;

class TryThread extends Thread {
    public TryThread next;

    public TryThread(String firstName, String secondName, long delay, TryThread t) {
        this.firstName = firstName;
        this.secondName = secondName;
        aWhile = delay;
        next = t;
    }

    public void run() {
        try {
            next.join();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            while (total < 1000) {
                System.out.print(firstName);
                sleep(aWhile);
                total += aWhile;
                System.out.print(secondName + "\n");
            }
            System.out.print(secondName + " stoped.\n");
        } catch (InterruptedException e) {
            System.out.println(firstName + secondName + e);
        }
    }

    private String firstName;
    private String secondName;
    private long aWhile;
    private long total;

    public long stamGetTotal() {
        // TODO Auto-generated method stub
        return total;
    }
}