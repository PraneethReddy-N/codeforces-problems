import java.util.Arrays;
import java.util.Scanner;

public class ShortSortA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int  t = in.nextInt();
        for(int i = 0;i<t;i++){
            String a = in.next();
            if(a.equals("abc")){
                System.out.println("YES");
            }else{
                char[] s = a.toCharArray();
                if(s[0] == 'a' && s[1] == 'c'){
                    char temp = s[1];
                    s[1] = s[2];
                    s[2] = temp;
                }
                else if(s[0] == 'b' && s[1] == 'a'){
                    char temp2 = s[0];
                    s[0] = s[1];
                    s[1] = temp2;
                }
                else if(s[0] == 'c' && s[1] =='b'){
                    char temp3 = s[0];
                    s[0] = s[2];
                    s[2] = temp3;
                }
                else{
                    System.out.println("No");
                }
                 String str = new String(s);
                 if(str.equals("abc")){
                    System.out.println("Yes");
                 }
            }
        }
    }
}
