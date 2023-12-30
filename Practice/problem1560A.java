import java.io.*;
import java.util.*;
public class problem1560A {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st= new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(read.readLine());
            for(int j = 1; ;j++){
                if(j% 3== 0 || j %10 ==3){
                    continue;
                }
                if(--n == 0){
                    out.println(j);
                    break;
                }
            } 
        }
        out.close();
    }
}
