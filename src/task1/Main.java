package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author UPCdevelopment
 */
public class Main {
    public static void main(String[] args) {
        double [][] matrix = new double[][]{{-3.0, 2.0, 6.0, 4.0},{10.0,-7.0,0.0,7.0},{5.0,-1.0,5.0,6.0}};

        Task000 task = new Task000(matrix);
        task.computer();
    }
}
