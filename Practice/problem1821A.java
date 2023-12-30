import java.io.*;
import java.util.*;
public class problem1821A {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            String line = read.readLine();
            int noOfPossibilities = 1;
            if(line.charAt(0) == '0'){
                out.println("0");
                continue;
            }
            else if(line.charAt(0) > 48 && line.charAt(0) <= 57 && line.length() < 1){
                out.println("1");
                continue;
            }
            for(int j = 0;j<line.length();j++){
                if( j == 0 && line.charAt(j) == '?'){
                    noOfPossibilities *= 9;
                }
                else if( j > 0 && line.charAt(j) =='?'){
                    noOfPossibilities *= 10;
                }
            }
            out.println(noOfPossibilities);
        }
        out.close();
    }
    
}
