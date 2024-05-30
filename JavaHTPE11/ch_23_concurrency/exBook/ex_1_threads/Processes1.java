package JavaHTPE11.ch_23_concurrency.exBook.ex_1_threads;

public class Processes1 {
    public static void main(String[] args) {
        boolean isDone = false;
        Name one = new Name("Amir");
        Name two = new Name("Or");
        Name three = new Name("Tamar");
        one.start();
        two.start();
        three.start();
        while (!isDone) {
            if (one.isFinished() && two.isFinished() && three.isFinished())
                isDone = true;
        }

        System.out.println("MAIN DONE");

    }
}
