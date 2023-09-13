import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageJ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        double[] array = new double[n];
        for(int i = 0;i<n;i++){
            array[i] = in.nextDouble();
            sum += array[i];
        }
        sum /= n;
        DecimalFormat df = new DecimalFormat("0.#######");
        String result = df.format(sum);
        System.out.println(result);
    }
}
