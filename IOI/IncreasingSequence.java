import java.io.*;
import java.util.*;

public class IncreasingSequence {
    public static void main(String[] args) throws IOException{
         BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            StringTokenizer nval = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(nval.nextToken());
            int []a = new int[n];
                String[] Aarray = f.readLine().split(" ");
                for(int x= 0;x<Aarray.length;x++){
                    a[x] = Integer.parseInt(Aarray[x]);
                }
                 int v= 1;
            for(int z : a){
                if(v == z){
                    v++;
                }
                v++;
            }
            out.println(v-1);
            }
            out.flush();
    }
}
    
