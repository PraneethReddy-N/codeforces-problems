import java.util.Arrays;
import java.util.Scanner;

public class Sorting{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        for(int i = 0;i<n.length;i++){
            n[i] = in.nextInt();
        }
        int a = n[0];
        int b = n[1];
        int c = n[2];
        Arrays.sort(n);
        for(int i = 0;i<n.length;i++){
            System.out.println(n[i]);
        }
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}