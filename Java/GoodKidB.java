import java.util.Scanner;

public class GoodKidB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            
            
            for (int k = 0; k < a.length; k++) {
                a[k] = in.nextInt();
            }
            
            
            int min = a[0];
            int minIndex = 0;
            for (int k = 1; k < a.length; k++) {
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
            }
            
            
            a[minIndex]++;
            
            
            int product = 1;
            for (int j = 0; j < a.length; j++) {
                product *= a[j];
            }
            
            System.out.println(product);
        }
    }
}
