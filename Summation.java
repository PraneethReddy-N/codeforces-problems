import java.util.Scanner;

public class Summation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        Long m = in.nextLong();
         n  = n %10;
         m = m % 10;
        Long result = n + m;
        System.out.println(result);
        in.close();
    }
}