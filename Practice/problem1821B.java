import java.io.*;
import java.util.*;

public class problem1821B {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            StringTokenizer nval = new StringTokenizer(read.readLine());
            int n  = Integer.parseInt(nval.nextToken());
            int[] a = new int[n];
            int[] aDash = new int[n];
            String[] aval = read.readLine().split(" ");
            for(int j = 0;j<aval.length;j++){
                a[j] = Integer.parseInt(aval[j]);
            }
            String[] aDashVal = read.readLine().split(" ");
            for(int k = 0;k<aDashVal.length;k++){
                aDash[k] = Integer.parseInt(aDashVal[k]);
            }
            for(int l = 0;l<a.length;l++){
                if(a[l] != aDash[l]){
                    int diffl = l;
                    break;
                }
            }
            for(int r = a.length-1;r>=0; r--){
                if(a[r] != aDash[r]){
                   int diffR = r;
                   break;
                }
            }
            
        }
        out.close();
    }
}
