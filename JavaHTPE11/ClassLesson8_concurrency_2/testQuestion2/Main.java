package JavaHTPE11.ClassLesson8_concurrency_2.testQuestion2;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = i + j;
            }
        }
        Manager m = new Manager(mat);
        Worker w1 = new Worker(m);
        Worker w2 = new Worker(m);
        w1.start();
        w2.start();
        System.out.print(m.getTotal());
    }
}
