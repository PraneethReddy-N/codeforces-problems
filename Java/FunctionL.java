import java.util.Scanner;

public class FunctionL {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        for(int i = 0;i<b.length;i++){
            b[i] = in.nextInt();
        }
            NewArray(a,b);

    }

    public static void NewArray(int[] a, int[] b) {
            int[] c = new int[a.length + b.length];
            for(int i = 0;i<b.length;i++){
                c[i] = b[i];
            }
            for(int i = 0;i<a.length;i++){
                c[b.length+i] = a[i];
            }
            for(int i = 0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
