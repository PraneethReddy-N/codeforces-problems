import java.util.Scanner;

public class Palindrome {
    //https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/I
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String rev = "";
        for(int  i = s.length()-1; i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
