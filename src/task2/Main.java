package task2;

/**
 * @author UPCdevelopment
 */
public class Main {
    public static void main(String[] args) {
        float[] a = new float[]{(float) 1.0, (float) 1.0, (float) 2.0};
        float[] b = new float[]{(float) 2.0, (float) 3.0, (float) 1.0, (float) 1.0};
        float[] c = new float[]{(float) 1.0, (float) 1.0, (float) 1.0};
        float[] x = new float[]{(float) 1.0, (float) 2.0, (float) -2.0 , (float) 0.0};
        Task003 task003 = new Task003();
        task003.run(x , a , b , c);

    }
}
