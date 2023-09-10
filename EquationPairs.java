import java.util.Scanner;

public class EquationPairs{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = n +m;
        int equ1;int equ2;
        int count = 0;
        for(int a = 0;a<sum;a++){
            for(int b = 0;b<sum;b++){
                equ1 = (int) Math.pow(a, 2) +b;
                equ2 = (int) Math.pow(b,2) +a;
                if(equ1 ==n && equ2 ==m){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}