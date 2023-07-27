import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringMatches{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count =0;
        int i =0;
        // if(s.matches("(.*)h+e+l+l+o+(.*)")){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }
        char[] array = {'h','e','l','l','o'};
        for(i = 0;i<s.length();){
            if(count == 5){
                break;
            }
            if(s.charAt(i) == array[count]){
                count++;
                i = i+1;
            }
            else{
                i++;
            }
        }
        if(count == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}