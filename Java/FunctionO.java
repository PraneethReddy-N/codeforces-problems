import java.util.Scanner;

public class FunctionO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maximum = findMaximum(numbers);
        int minimum = findMinimum(numbers);
        int primeCount = countPrimes(numbers);
        int palindromeCount = countPalindromes(numbers);
        int maxDivisorNumber = findNumberWithMaxDivisors(numbers);

        System.out.println("The maximum number : " + maximum);
        System.out.println("The minimum number : " + minimum);
        System.out.println("The number of prime numbers : " + primeCount);
        System.out.println("The number of palindrome numbers : " + palindromeCount);
        System.out.println("The number that has the maximum number of divisors : " + maxDivisorNumber);
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reverseStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reverseStr);
    }

    public static int countPalindromes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findNumberWithMaxDivisors(int[] numbers) {
        int maxDivisors = -1;
        int result = -1;
        for (int num : numbers) {
            int divisors = countDivisors(num);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                result = num;
            } else if (divisors == maxDivisors) {
                result = Math.max(result, num);
            }
        }
        return result;
    }
}
