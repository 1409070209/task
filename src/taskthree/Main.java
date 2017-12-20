package taskthree;

/**
 * @author UPCdevelopment
 */
public class Main {
    public static void main(String[] args) {
        double[] x = new double[]{1.1275,1.1503,1.1735,1.1972};
        double[] y = new double[]{0.1191,0.13954,0.15932,0.17903};
        System.out.println(new Computer().lagrange(x , y , 1.1300));
        x = new double[]{1.615, 1.634, 1.702, 1.828, 1.921};
        y = new double[]{2.4145, 2.46459, 2.65271, 3.03035, 3.34066};
        System.out.println(new Computer().newton(1.682 ,x , y));
        System.out.println(new Computer().newton(1.813 ,x , y));
    }
}
