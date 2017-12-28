package taskfour;

/**
 * @author UPCdevelopment
 */
public class Computer {

    public static double Trapezoid(double[] f) throws Exception {
        if (f == null) {
            throw new Exception("敢给我传null");
        }
        if (f.length == 0) {
            return 0.0;
        }
        double lastItem = f[0];
        double sum = 0.0;
        for (int i = 1; i < f.length; i++) {
            double item = f[i];
            sum += 0.05*(item+lastItem);
            lastItem = item;
        }
        return sum;
    }
    public static double Simpson(double[] f) throws Exception {
        if (f == null) {
            throw new Exception("敢给我传null?");
        }
        int minLen = 2;
        if (f.length < minLen) {
            return 0;
        }
        double sum = 0.0;
        for (int i = 2; i < f.length; i+=minLen) {
            double rightItem = f[i];
            double leftItem = f[i-2];
            double middleItem = f[i-1];
            int a = i-2;
            sum += ((i - a) / 6.0 / 10) * (leftItem + rightItem + (middleItem * 4));
        }
        return sum;
    }
}
