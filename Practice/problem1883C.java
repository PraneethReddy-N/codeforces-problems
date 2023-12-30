import java.util.*;
import java.io.*;
public class problem1883C {
    public static void main(String[] args)throws Exception{
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            String[] nkValues = read.readLine().split(" ");
            int n = Integer.parseInt(nkValues[0]);
            int k = Integer.parseInt(nkValues[1]);
            int[] a = new int[n];
            int product = 1;
            StringTokenizer array = new StringTokenizer(read.readLine());
            for(int j = 0;j<a.length;j++){
                a[j] = Integer.parseInt(array.nextToken());
                product *= a[j];
            }
            if(product % k == 0){
                out.println("0");
                continue;
            }
            else{
                  
            }
        }
        out.close();
    }
}
