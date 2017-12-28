package taskfour;

/**
 * @author UPCdevelopment
 */
public class Main {
    public static void main(String[] args) throws Exception {
        double[] f = new double[]{1, 1.004971, 1.019536, 1.042668, 1.072707, 1.107432, 1.144157, 1.179859, 1.211307, 1.235211, 1.248375};
        System.out.println(Computer.Trapezoid(f));
        System.out.println(Computer.Simpson(f));
    }
}
