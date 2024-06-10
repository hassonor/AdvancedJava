package JavaHTPE11.ClassLesson8_concurrency_2.review.q2;

public class Main {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i + j;
            }
        }

        Manager m = new Manager(mat);
        Worker w1 = new Worker(m);
        Worker w2 = new Worker(m);

        w1.start();
        w2.start();

        System.out.println(m.getTotal());
    }

}
