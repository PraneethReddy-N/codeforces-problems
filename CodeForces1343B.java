//https://codeforces.com/problemset/problem/1343/B

import java.util.Scanner;

public class CodeForces1343B{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int k =0;k<t;k++){
        int n = in.nextInt();
        int[] a = new int[n];
        int val = 2;
        if((n/2)%2 != 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        for(int i = 0;i<n/2;i++){
            System.out.print(val + " ");
            val += 2;
        }
        int j = val -2;
        int odd = 1;
        for(int i = 1 ;i<n/2;i++){
            System.out.print(odd + " ");
            odd = odd+2;
        }
        System.out.print(j +((n/2)-1));
        System.out.println();
    }
}
    }
}