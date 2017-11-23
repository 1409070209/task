package task0;

/**
 * @author UPCdevelopment
 */
public interface Computer {
    /**
     * 计算函数的值
     * @param x 横坐标
     * @return Double
     */
    Double computer(Double x);

    /**
     * 计算误差
     * @param x 横坐标
     * @return Double
     */
    Double error(Double x);

    /**
     * 开始计算
     * @param left 左值
     * @param right 右值
     * @return
     */
    Double run(Double left , Double right);


    /**
     * @param x
     * @return
     */
    Double getErrorY(Double x);
}
