package taskthree;

/**
 * @author UPCdevelopment
 */
public class Computer {
    public double lagrange(double[] X , double[] Y , double x) {
        int N = X.length;
        double result = 0;
        for (int i = 0; i < N; i++) {
            double temp = Y[i];
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    temp = temp * (x - X[j]);
                    temp = temp / (X[i] - X[j]);
                }
            }
            result += temp;
        }
        return result;
    }
    double run(int n,double[] X,double[] Y){
        double f=0;
        double temp=0;
        for(int i=0;i<n+1;i++){
            temp=Y[i];
            for(int j=0;j<n+1;j++) {
                if (i != j) {
                    temp /= (X[i] - X[j]);
                }
            }
            f += temp;
        }
        return f;
    }
    public double newton(double x , double[] X , double[] Y){
        double result=0;
        for(int i=0;i<X.length;i++){
            double temp=1;
            double f=run(i,X,Y);
            for(int j=0;j<i;j++){
                temp = temp*(x-X[j]);
            }
            result += f*temp;
        }
        return result;
    }
    public void gaussSeidel(){

    }
}
