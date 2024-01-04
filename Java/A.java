//https://codeforces.com/problemset/problem/1512/A

import java.util.Arrays;
import java.util.Scanner;

public class A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0;j<t;j++){
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        boolean found  = false;
       for(int i = 1;i<a.length-1;i++){
           if(a[i] != a[i-1] && a[i] != a[i+1]){
            System.out.println(i+1);
            found = true;
           }
    }
            if(!found){
                if(a[0] !=a[1]){
                    System.out.println("1");
                }
                else{
                    System.out.println(n);
                }
            }

        }
    }
}