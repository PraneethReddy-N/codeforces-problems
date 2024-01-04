import java.util.Scanner;

public class Candies{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i =0;i<t;i++){
            int n = in.nextInt();
            if(n == 1 || n ==2){
                System.out.println("0");
            }
            else{
            System.out.println((n-1)/2);
        }
    }
    in.close();
}
}