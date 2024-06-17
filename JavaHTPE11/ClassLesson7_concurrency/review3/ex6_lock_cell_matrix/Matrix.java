package JavaHTPE11.ClassLesson7_concurrency.review3.ex6_lock_cell_matrix;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Matrix {
    private int[][]mat;

    private Lock[][] locks;

    public Matrix(int[][] mat){
        this.mat = mat;
        locks = new Lock[mat.length][mat[0].length];
        for(int i = 0; i < mat.length;i++){
            for(int j =0; j < mat[0].length;j++){
                locks[i][j] = new ReentrantLock();
            }
        }
    }

    public int get(int i, int j){
        locks[i][j].lock();
        try {
            return mat[i][j];
        }
        finally {
            locks[i][j].unlock();
        }
    }

    public void set(int i,int j, int val){
        locks[i][j].lock();
        try {
            mat[i][j] = val;
        }
        finally {
            locks[i][j].unlock();
        }
    }
}
