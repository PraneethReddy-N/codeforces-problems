import java.util.Scanner;

public class Expressions{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int first = a + b + c;
        int second = a * b *c;
        int third = a*(b+c);
        int fourth = (a+b)*c;
        int fifth = (a*b)+c;
        int sixth = a+(b*c);
        System.out.println(Math.max(first,Math.max(second,Math.max(third,Math.max(fourth,Math.max(fifth,sixth))))));
        in.close();
    }
}