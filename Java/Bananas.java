import java.util.Scanner;

public class Bananas{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int result;
        for(int i = 1;i<=w;i++){
            n = n - i * k;
        }
        if(n < 0){
            result = Math.abs(n);
        System.out.println(result);
                }
                else{
                    System.out.println(0);
                }        in.close();
    }
}