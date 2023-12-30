import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class problem1551A{
    public static void main(String[] args) throws IOException{
        BufferedReader read =  new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        long tempc1 = 0;
        long tempc2  = 0;
        for(int i = 0;i<t;i++){
            StringTokenizer n = new StringTokenizer(read.readLine());
            long nval = Integer.parseInt(n.nextToken());
            long minDifference = nval;
            if(nval == 1){
                out.println(nval + " " + 0);
                continue;
            }
            for(int j = 1;j<=nval;j++){
                long c1 = j;
                for(int k = 1;k<=nval;k++){
                    long c2 = k;
                    if(c1 + (2 * c2) == nval){
                        if(Math.abs(c1-c2) < minDifference){
                            minDifference = Math.abs(c1 - c2);
                            tempc1 = c1;
                            tempc2 = c2;
                        } 
                    }
                }
            }
            out.println(tempc1 + " " + tempc2);
        }
        out.close();
    }
}