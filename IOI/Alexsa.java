import java.util.Scanner;

public class Alexsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            long num = 2;
            for (int i = 0; i < n; i++)
            {
                System.out.print(num + " ");
                num += 3;
            }
            System.out.println();
        }
    }
}
