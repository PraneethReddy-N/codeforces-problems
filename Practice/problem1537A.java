import java.io.*;
import java.util.*;
public class problem1537A {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st= new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int sum = 0;
            StringTokenizer nval = new StringTokenizer(read.readLine());
            int n = Integer.parseInt(nval.nextToken());
            String[] values = read.readLine().split(" ");
            long[] array = new long[n];
            for(int j = 0;j<n;j++){
                array[j] = Integer.parseInt(values[j]);
                sum += array[j]; 
            }
            if(sum == n){
                out.println("0");
            }
            else if(sum < n){
                out.println("1");
            }
            else if(sum > n){
                out.println(sum -n);
            }
        }
        out.close();
    }
}