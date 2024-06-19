package JavaHTPE11.ClassLesson11_test_questions.testQuestion3_concurrency.c;

public class Main {
    public static void main(String[] args) {
        ResourceAllocator ra = new ResourceAllocator(20);
        ResourceThread[] rts = new ResourceThread[10];

        for (int i = 0; i < 10; i++) {
            rts[i] = new ResourceThread(ra);
        }

        for (int i = rts.length - 1; i >= 0; i--) {
            rts[i].start();
        }

        for (int i = 0; i < rts.length; i++) {
            try {
                rts[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("DONE");


    }
}
