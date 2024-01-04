import java.util.Scanner;

public class Divisibility{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count =0;
        for(int i = 0;i<t;i++){
            long a = in.nextLong();
            long b = in.nextLong();
            if( a % b == 0){
                System.out.println("0");
            }
            else{
                while(a%b !=0){
                a =a +1;
                count++;
                }
                System.out.println(count);
            }
            
            count = 0;
        }
        in.close();
    }
}