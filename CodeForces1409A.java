//https://codeforces.com/problemset/problem/1409/A

import java.util.Scanner;

public class CodeForces1409A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int  t = in.nextInt();
        int count = 0;
        double rem ;
        for(int  i = 0; i < t;i++){
          Integer a = in.nextInt();
          Integer b = in.nextInt();
          rem = Math.abs(a -b);
          if(rem == 0){
            System.out.println("0");
            
          }
          else{
            rem = rem/10;
            count += Math.ceil(rem);
            System.out.println(count);
            count = 0;
          }
        }
        in.close();
    }
}