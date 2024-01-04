import java.util.Scanner;

public class TleDay3P2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long A = in.nextLong();
        Long B = in.nextLong();
        Long C = in.nextLong();
        Long max = Math.max(A, Math.max(B, C));
        Long min = Math.min(A,Math.min(B,C));
        System.out.print(min + " " + max);
        in.close();
    }
}