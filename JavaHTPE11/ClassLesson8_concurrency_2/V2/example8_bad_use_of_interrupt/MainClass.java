package JavaHTPE11.ClassLesson8_concurrency_2.V2.example8_bad_use_of_interrupt;

public class MainClass {
    public static void main(String[] args) {
        Thread first = new TryThread("A ", "a ", 200);

        first.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Main========================>" + e);
        }
        first.interrupt();//way#2


        System.out.println("after main........................");
    }
}


//Thread second = new TryThread("B ", "b ", 300L);
//Thread third = new TryThread("C ", "c ", 500L);
//second.start();
//third.start();