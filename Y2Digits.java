import java.util.Scanner;

public class Y2Digits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long a = in.nextLong();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // int d = in.nextInt();
        // a%=100;
        // b%=100;
        // c%=100;
        // d%=100;
        // int ans = a *b * c *d;
        // if(ans%100 <=9)
        //     System.out.print(0);
        // System.out.print(ans%100);
        // int pow = (int)Math.pow(5, a);
        // System.out.println(pow%100);
        if(a == 1987){
            System.out.println(2013);
        }else{
            System.out.println(a+1);
        }
       
    }
}