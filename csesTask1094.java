import java.util.Scanner;

public class csesTask1094 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int  i =1;i<n;i++){
            if(a[i]<a[i-1]){
                count+= a[i-1] - a[i];
                a[i] = a[i-1];
            }
        }
        System.out.println(count);
    }
}
