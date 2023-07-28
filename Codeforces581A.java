//https://codeforces.com/problemset/problem/581/A

import java.util.Scanner;

public class Codeforces581A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int max_days = 0;
        int leftout = 0;
        int k = Math.min(a, b);
        max_days = k;
        a -= k;
        b -=k;
        while(a>1){
            leftout++;
            a -=2;
        }
        while(b>1){
            leftout++;
            b -=2;
        }
        System.out.println(max_days +  "  " + leftout);
        in.close();

    }
}