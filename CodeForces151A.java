//https://codeforces.com/problemset/problem/151/A

import java.util.Scanner;

public class CodeForces151A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();
        int no_of_liters_for_each = (k*l)/nl;
        int slice_of_lime_for_each = c * d;
        int salt_for_each = p/np;
        int no_of_toast = Math.min(no_of_liters_for_each,Math.min(salt_for_each,slice_of_lime_for_each))/n;
        System.out.println(no_of_toast);
        in.close();
    }
}