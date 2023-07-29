//https://codeforces.com/problemset/problem/472/A

import java.util.Scanner;

public class CodeForces472A{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if( x % 2 == 0){
            x = x - 4;
            System.out.println(4 +" " + x);
        }
        else{
            x = x -9;
            System.out.println(x + " " + 9);
        }
        in.close();
    }
}