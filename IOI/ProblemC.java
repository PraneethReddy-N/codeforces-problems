import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            long sum_k = k * (k + 1) / 2;
            long sum_largest_k = (n - k + 1 + n) * k / 2;
            if (x >= sum_k && x <= sum_largest_k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

