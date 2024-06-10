package JavaHTPE11.ClassLesson8_concurrency_2.V2.ex8_bad_use_of_interrupt;

class TryThread extends Thread {
    public TryThread(String firstName, String secondName, long delay) {
        this.firstName = firstName;
        this.secondName = secondName;
        aWhile = delay;

    }

    public void run() {
        try {
            int i = 10;
            while (true) {
                System.out.print(firstName);
                sleep(aWhile);
                System.out.print(secondName + "\n");
            }
        } catch (InterruptedException e) {
            System.out.println("=================>=================>=================>" + firstName + secondName + e);
        }
    }

    private String firstName;
    private String secondName;
    private long aWhile;
}
