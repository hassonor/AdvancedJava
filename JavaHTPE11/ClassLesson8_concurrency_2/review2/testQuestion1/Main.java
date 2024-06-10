package JavaHTPE11.ClassLesson8_concurrency_2.review2.testQuestion1;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2, 2}, {2, 3, 3}};
        Manager m = new Manager(mat);
        Worker w1 = new Worker(m);
        Worker w2 = new Worker(m);

        w1.start();
        w2.start();

        System.out.println(m.getTotal());
    }
}
