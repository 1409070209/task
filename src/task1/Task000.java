package task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author UPCdevelopment
 */
public class Task000 {
    private double[][] matrix;

    Task000(double[][] matrix) {
        this.matrix = matrix;
    }
    double[][] computerAfter(){
        double[] solve = new double[matrix.length];
        int len = 0;
        for (int i = matrix.length-1;i >= 0;i--) {
            double sum = 0.0;
            for (int j = 0;j < len;j++) {
                sum += solve[j]*matrix[i][matrix[i].length-2-j];
            }
            matrix[i][matrix[i].length-1] -= sum;
            matrix[i][matrix[i].length-1] /= matrix[i][matrix[i].length-2-len];
            solve[len++] = matrix[i][matrix[i].length-1];
        }
        return this.matrix;
    }
    double[][] computer(){
        for (int i = 0; i < this.matrix.length-1; i++) {
            for (int j = i+1;j < this.matrix.length;j++){
                if (this.matrix[i][i] == 0.0 ) {
                    continue;
                }
                double a = this.matrix[j][i] / this.matrix[i][i];
                for (int k = 0;k < this.matrix[j].length;k++) {
                    this.matrix[j][k] -= this.matrix[i][k] * a;
                }
            }
        }
        computerAfter();
        return this.matrix;
    }
    void out(){
        for (double[] item : matrix) {
            for (double item1 : item) {
                System.out.print(item1 + " ");
            }
            System.out.println();
        }
    }
}
