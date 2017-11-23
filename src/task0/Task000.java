package task0;

/**
 * @author UPCdevelopment
 * x*x - 2 * x - 5 = 0   [2,3]
 */
public class Task000 implements Computer {

    private Double num = 0.01;

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public Double computer(Double x) {
        return x * x * x - 2 * x - 5;
    }

    @Override
    public Double error(Double x) {
        return this.computer(x) - 0;
    }

    @Override
    public Double run(Double left, Double right) {
        Double mid = (left + right) / 2;
        while (right - left > this.num) {
            this.count ++;
            mid = (left+right) / 2;
            Double solve = this.computer(mid);
            if (solve <= 0) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return mid;
    }

    @Override
    public Double getErrorY(Double x) {
        return null;
    }


}
