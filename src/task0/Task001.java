package task0;

/**
 * @author UPCdevelopment
 */
public class Task001 implements Computer {

    private Double num = 0.0001;

    @Override
    public Double computer(Double x) {
        return x*x*x-3*x-1;
    }

    @Override
    public Double error(Double x) {
        return this.computer(x) - 0;
    }

    private Double computer1(Double x) {
        return 3*x*x-3;
    }

    @Override
    public Double run(Double left , Double right) {
        Double next = left;
        while (Math.abs(this.error(next)) >= this.num) {
            Double solve = this.computer(next);
            Double solve1 = this.computer1(next);
            Double area = solve / solve1;
            next = next - area;
        }
        return next;
    }

    @Override
    public Double getErrorY(Double x) {
        return null;
    }
}
