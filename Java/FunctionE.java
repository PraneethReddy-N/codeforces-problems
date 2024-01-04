import java.util.Scanner;

public class FunctionE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x,y);
    }

    public static void swap(int x, int y) {
        int temp=0;
         temp = x;
         x = y;
         y = temp;
         System.out.println(x + " " +y);
    }
}
