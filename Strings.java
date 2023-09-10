import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(a.length() + " " + b.length());
        System.out.println(a + b);
        char c1 = a.charAt(0);
        char c2 = b.charAt(0);
        String str = "" + c2;
        String str2 = "" + c1;
        for(int i = 1;i<a.length();i++){
           str+= a.charAt(i);
        }
        for(int i = 1;i<b.length();i++){
           str2 += b.charAt(i);
        }
         System.out.println(str + " " + str2);
    }
}
