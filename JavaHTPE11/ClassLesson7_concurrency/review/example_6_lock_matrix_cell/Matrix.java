package JavaHTPE11.ClassLesson7_concurrency.review.example_6_lock_matrix_cell;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Matrix {
    private int[][] mat;

    private Lock[][] locks;

    public Matrix(int[][] mat) {
        this.mat = mat;
        locks = new Lock[mat.length][mat[0].length];
        createLocks(mat.length, mat[0].length);
    }

    private void createLocks(int rowLen, int colLen) {
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                locks[i][j] = new ReentrantLock();
            }
        }
    }

    public int get(int i, int j) {
        locks[i][j].lock();
        try {
            return mat[i][j];
        } finally {
            locks[i][j].unlock();
        }
    }

    public void set(int i, int j, int val) {
        locks[i][j].lock();
        try {
            mat[i][j] = val;
        } finally {
            locks[i][j].unlock();
        }
    }
}
