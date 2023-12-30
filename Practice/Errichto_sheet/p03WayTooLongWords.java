package Errichto_sheet;
import java.util.*;
import java.io.*;

public class p03WayTooLongWords {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer s = new StringTokenizer(read.readLine());
        int n = Integer.parseInt(s.nextToken());
        for(int i =0;i<n;i++){
            String words = read.readLine();
            if(words.length() > 10){
                out.print(words.charAt(0));
                out.print(words.length()-2);
                out.print(words.charAt(words.length()-1));
                out.println();
            }else{
                out.println(words);
            }
        }
        out.close();
    }
}
