package Errichto_sheet;
import java.io.*;

public class p04PetyaandStrings {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String First = read.readLine().toLowerCase();
        String Second = read.readLine().toLowerCase();
        boolean found = false;
        for(int i = 0;i<First.length();i++){
            if(First.charAt(i) < Second.charAt(i)){
                found=true;
                out.println("-1");
                break;
            }
            else if(First.charAt(i) > Second.charAt(i)){
                found = true;
                out.println("1");
                break;
            }
        }
        if(!found){
            out.println("0");
        }
        out.close();
    }
}
