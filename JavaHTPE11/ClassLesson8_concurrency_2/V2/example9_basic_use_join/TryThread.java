package JavaHTPE11.ClassLesson8_concurrency_2.V2.example9_basic_use_join;

class TryThread extends Thread {
    public TryThread(String firstName, String secondName, long delay) {
        this.firstName = firstName;
        this.secondName = secondName;
        aWhile = delay;
        //setDaemon(true);
    }

    public void run() {
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

        return total;
    }
}