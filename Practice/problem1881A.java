import java.io.*;
import java.util.*;

public class problem1881A {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int count = 0;
            boolean found = false;
            String[] nmValues = read.readLine().split(" ");
            int nValu = Integer.parseInt(nmValues[0]);
            int mValu = Integer.parseInt(nmValues[1]);
            StringTokenizer xVal = new StringTokenizer(read.readLine());
            String x = xVal.nextToken();
            StringTokenizer sVal = new StringTokenizer(read.readLine());
            String s = sVal.nextToken();
           if(x.contains(s)){
            out.println(0);
            continue;
           }
           else{
            StringBuilder sb = new StringBuilder(x);
            while(sb.length() <= nValu * mValu){
                sb.append(x);
                count++;
                if(sb.toString().contains(s)){
                    out.println(count);
                    found = true;
                    break;   
                }
                x = sb.toString();
            }
           }
            if(!found){
                out.println("-1");
            }
        }
        out.flush();
    }
}
