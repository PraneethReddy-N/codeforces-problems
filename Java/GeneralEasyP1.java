import java.util.Scanner;

public class GeneralEasyP1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String pattern = "\\?+";
        if(s.matches(pattern)){
            for(int i = 0;i<s.length();i++){
                System.out.print("a");
            }
            return;
        }
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev) && !s.contains("?")){
            System.out.println(s);
        }
        else{
             for(int i = 0;i<s.length();i++){
                if (s.charAt(i) == '?') {
                        if(i == s.length()-1){
                            s = s.substring(0, i) + s.charAt(0) + s.substring(i + 1);
                            continue;
                        }
                        s = s.substring(0, i) + s.charAt(i + 1) + s.substring(i + 1);
                }                
            
             }
             String rever = new StringBuilder(s).reverse().toString();
             if(s.equals(rever)){
                System.out.println(s);
             }else{
                System.out.println("-1");
             }
        }
        // String reverseStr = new StringBuilder(s).reverse().toString();
    }

}