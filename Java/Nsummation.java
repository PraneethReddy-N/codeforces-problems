import java.util.Scanner;

public class Nsummation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long N = in.nextLong();
        Long result = N *(N+1)/2;
        System.out.println(result);
        in.close();
    }
}