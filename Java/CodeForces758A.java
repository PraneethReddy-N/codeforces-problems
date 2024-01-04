//https://codeforces.com/problemset/problem/758/A

import java.util.Arrays;
import java.util.Scanner;

public class CodeForces758A{
    public static void main(String[] args){
        Scanner  in= new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        for(int i = 0;i<n;i++){
             a[i] = in.nextInt(); 
        }
        Arrays.sort(a);
        int max = a[n-1];
        for(int  i =0;i<=n-2;i++){
            count += max - a[i];
        }
        System.out.println(count);
        in.close();
    }
}