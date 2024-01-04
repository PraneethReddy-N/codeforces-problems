//https://codeforces.com/problemset/problem/1154/A

import java.util.Arrays;
import java.util.Scanner;

public class CodeForces1154A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[]n = new int[4];
        int [] answer = new int[n.length-1];
        for(int  i =0;i<4;i++){
            n[i]= in.nextInt();
        }
        Arrays.sort(n);
        for(int i = 0; i < n.length-1;i++){
            answer[i] = n[i] - n[n.length-1];
            System.out.println(Math.abs(answer[i]));
        }
        in.close();
    }
}