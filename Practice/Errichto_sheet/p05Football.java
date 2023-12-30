package Errichto_sheet;

import java.io.*;


public class p05Football {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String s = read.readLine();
        int count1 = isDangerous1(s);
        int count0 = isDangerous0(s);
        if(count0 >= 7 || count1 >=7){
            out.println("YES");
        }else{
            out.println("NO");
        }
        out.close();
    }

    private static int isDangerous1(String s) {
        int count1 = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1' && count1 < 7){
                count1++;
            }else{
                if(count1 < 7)
                count1 = 0;
            }
        }
        return count1;
        }

    

    private static int isDangerous0(String s) {
        int count0 = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0' && count0 < 7){
                count0++;
            }else{
                if(count0 < 7)
                count0 = 0;
            }
        }
        return count0;
    }
    
}

