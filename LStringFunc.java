import java.util.Scanner;
import java.util.regex.Pattern;

public class LStringFunc {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
         String seq = "hello";
         int count = 0;int j =0;
        for(int  i = 0;i<s.length();i++){
            if(s.charAt(i) == seq.charAt(j)){
                j++;
                count++;
            }
            if (count == seq.length()) {
                break; 
            }
        }
        if(count == seq.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
