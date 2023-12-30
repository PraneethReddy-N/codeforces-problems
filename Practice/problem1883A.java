import java.util.*;
import java.io.*;
public class problem1883A {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int count = 0;
            String display = "1234567890";
            StringTokenizer DigitCode = new StringTokenizer(read.readLine());
            String pinCode =  DigitCode.nextToken();
            int k = 0;
            int j =0;
            while(k != pinCode.length()){
                if(getNumericValue(display.charAt(j)) == getNumericValue(pinCode.charAt(k))){
                    k++;
                    count++;
                }
                else if(getNumericValue(display.charAt(j)) > getNumericValue(pinCode.charAt(k))){
                    while(pinCode.charAt(k) != display.charAt(j)){
                    j--;
                    count++;
                    }
                }
                else if(getNumericValue(display.charAt(j)) < getNumericValue(pinCode.charAt(k))){
                    while(pinCode.charAt(k) != display.charAt(j)){
                    j++;
                    count++;
                    }
                }
            }
        out.println(count);
        } 
        out.close();
     }
     public static int getNumericValue(char c) {
        if (c == '0') return 10;
        return Character.getNumericValue(c);
    }
}
