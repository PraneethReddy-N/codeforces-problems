import java.util.Scanner;

public class FunctionH {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int N  = in.nextInt();
            char c = in.next().charAt(0);
            printchar(N,c);
        } 

    }

    public static void printchar(int n, char c) {
        for(int i = 0;i<n;i++){
            System.out.print(c +" ");
        }
        System.out.println();
    }
}
