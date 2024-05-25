package JavaHTPE11.ClassLesson7_concurrency.ex3_implement_Runnable_adn_create_Thread_Object;


public class Main {
    public static void main(String[] args) {


        OneToTwenty first = new OneToTwenty("FIRST");
        OneToTwenty second = new OneToTwenty("SECOND");
        OneToTwenty third = new OneToTwenty("THIRD");

        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);
        t1.start();
        t2.start();
        t3.start();

        System.out.println("DONE");
    }
}
