import java.util.Scanner;

public class EvenHateOdd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int even =0;
        int odd = 0;
        while(t != 0){
            int n = in.nextInt();
            for(int j= 0;j<n;j++){
                int a = in.nextInt();
                if(a %2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(even == odd){
                System.out.println("0");
            }
            else if(n % 2 !=0){
                System.out.println("-1");
            }
            else{
                System.out.println(Math.abs((even - odd)/2));
            }
            t--;
        }
}
}