import java.util.Scanner;

public class FunctionF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        Function(x,n);
        
    }

    public static void Function(int x, int n) {
        int s =0;
        for(int i = 0;i<=n;i+=2){
            if(i ==0){
            s += (int) Math.pow(x, i)-1;
        }else{
            s += (int) Math.pow(x, i);
        }
    }
    System.out.println(s);
    }
}
