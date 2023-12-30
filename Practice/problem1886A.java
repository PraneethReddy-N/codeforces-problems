import java.io.*;
import java.util.*;

public class problem1886A {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        long t = Integer.parseInt(st.nextToken());
         for(int i = 0;i<t;i++){ 
            StringTokenizer nval = new StringTokenizer(read.readLine());
            long n = Integer.parseInt(nval.nextToken());
            if(n <= 6) {
                out.println("NO");
            }
            else {
                if((n - 3) % 3 != 0) {
                    out.println("YES");
                    out.println(1 + " " + 2 + " " + (n - 3));
                }
                else if((n - 5) % 3 != 0) {
                    if(n - 5 != 4) {
                        out.println("YES");
                        out.println(1 + " " + 4 + " " + (n - 5));
                    }
                    else {
                        out.println("NO");
                    }
                }
                else {
                    out.println("NO");
                }
            }
        }
        out.close();
}
}
