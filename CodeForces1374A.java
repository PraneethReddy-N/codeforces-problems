//https://codeforces.com/problemset/problem/1374/A

import java.util.Scanner;

public class CodeForces1374A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int  t = in.nextInt();
        for(int i = 0;i<t;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();
            int rem = n%x;
            int change = (rem-y+x)%x;
            n-=change;
            System.out.println(n);
        }
        in.close();
    }
}