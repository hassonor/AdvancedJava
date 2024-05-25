package JavaHTPE11.ClassLesson7_concurrency.ex8_lock_matrix_cell;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Matrix {

    private Lock[][] locks;
    private int[][] mat;

    public Matrix(int[][] mat) {
        this.mat = mat;
        locks = new Lock[mat.length][mat[0].length];

        // init locks matrix
        createLocksArray(mat.length, mat[0].length);
    }

    private void createLocksArray(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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
