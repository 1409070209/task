package task2;

/**
 * @author UPCdevelopment
 */
public class Task003 {
    private void out(float x[]) {
        for (float aX : x) {
            System.out.print(aX);
        }
        System.out.println();
    }
    public void run(float[] x, float[] a, float[] b, float[] c)
    {

        c[0] = c[0] / b[0];
        x[0] = x[0] / b[0];

        for (int n = 1; n < x.length; n++) {
            float m = 1.0f / (b[n] - a[n] * c[n - 1]);
            c[n] = c[n] * m;
            x[n] = (x[n] - a[n] * x[n - 1]) * m;
        }

        for (int n = x.length - 1; n-- > 0; ) {
            x[n] = x[n] - c[n] * x[n + 1];
        }
        this.out(x);
        this.out(a);
        this.out(b);
        this.out(c);
    }
}
