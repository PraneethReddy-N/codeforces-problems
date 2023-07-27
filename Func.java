import java.util.Scanner;

public class Func{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
		long fn;
		if (n%2 == 0) 
        fn = n/2;
		else 
        fn = (-1)*(n/2 + 1);

        System.out.println(fn);
        in.close();
    }
}