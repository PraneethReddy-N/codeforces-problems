import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class problem1557A {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        long t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            StringTokenizer st2 = new StringTokenizer(read.readLine());
            long nval = Integer.parseInt(st2.nextToken());
            String[] values = read.readLine().split(" ");
            long[] array = new long[(int) nval];
            long[] prefixSum = new long[(int) nval];
            for (int j = 0; j < values.length; j++) {
                array[j] = Integer.parseInt(values[j]);
            }
           Arrays.sort(array);  
            prefixSum[0] = array[0];
            for (int j = 1; j < values.length; j++) {
                prefixSum[j] = prefixSum[j - 1] + array[j];
            }
            double totalSum = Double.NEGATIVE_INFINITY;
            for (int k = 0; k < array.length - 1; k++) {
                double sumOfA = (double) prefixSum[k] / (k + 1);
                double sumOfB = (double) (prefixSum[array.length - 1] - prefixSum[k]) / (array.length - k - 1);
                if (sumOfA + sumOfB > totalSum) {
                    totalSum = sumOfA + sumOfB;
                }
            }
            out.printf("%.9f%n",totalSum);
        }
        out.flush();
    }
}