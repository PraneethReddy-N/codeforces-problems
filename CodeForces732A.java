//https://codeforces.com/problemset/problem/732/A

import java.util.Scanner;

public class CodeForces732A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int count = 0;
        for(int  i =1;i<10;i++){
            count = i * k;
            if(count%10 ==0|| count%10 == r){
                System.out.println(i);
                System.exit(0);
            }
        }
        in.close();
    }
}