import java.util.Scanner;

public class FunctionK {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        shiftRight(a,x);
    }

    public static void shiftRight(int[] a, int x) {
         if(x % 2 == 1){
             int lastelement = a[a.length-1];
            for(int i = a.length-1;i>0;i--){
                a[i] = a[i-1];
            }
            a[0] = lastelement;
        }
        for(int i = 0;i<a.length-1;i++){
            System.out.print(a[i] +" ");
        }
        System.out.print(a[a.length-1]);
    }
}