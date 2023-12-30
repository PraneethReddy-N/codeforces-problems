import java.util.*;
import java.io.*;
public class problem1884B {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int j = 0;j<t;j++){
            StringTokenizer nval = new StringTokenizer(read.readLine());
            int n = Integer.parseInt(nval.nextToken());
            String nLength = read.readLine();
             int number = Integer.parseInt(nLength, 2);
            for(int i = 1;i<=n;i++){
                if( number % Math.pow(2, i) == 0){
                    out.print("0");
                }else{
                    
                }
            }
        }
    }
}


