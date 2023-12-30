import java.io.*;
import java.util.*;
public class problem1542A {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st= new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int evenCount= 0;
            int oddCount = 0;
            StringTokenizer n = new StringTokenizer(read.readLine());
            int nval = Integer.parseInt(n.nextToken());
            String [] values = read.readLine().split(" ");
            int [] array = new int[2 * nval];
            for(int k = 0;k<values.length;k++){
                array[k] = Integer.parseInt(values[k]);
            }
            for(int j=0;j<array.length;j++){
                if(array[j] % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            if(evenCount == oddCount){
                out.println("Yes");
            }else{
                out.println("No");
            }
        }
        out.close();
    }
}
