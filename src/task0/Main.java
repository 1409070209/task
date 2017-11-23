package task0;

/**
 * @author UPCdevelopment
 * x*x - 2 * x - 5 = 0   [2,3]
 * x*x*x-3*x-1 = 0    2附近精确到四位
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("第一题");
        Task000 task000 = new Task000();
        Double solve = task000.run(2.0 , 3.0);
        System.out.println("结果为：" + solve);
        System.out.println("误差为：" + task000.error(solve));
        System.out.println(task000.getCount());

        System.out.println("第二题");
        Double solve1 = new Task001().run(2.0 , 0.0);
        System.out.println("结果为：" + solve1);
        System.out.println("误差为：" + new Task001().error(solve1));
    }
}
