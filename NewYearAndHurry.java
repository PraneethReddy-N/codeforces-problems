import java.util.Scanner;

public class NewYearAndHurry{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int total = 240;
        int count = 0;
        int remaining = total - k;
        for(int i =1;i<=n;i++){
            if(remaining >= i*5){
                remaining = remaining - i*5;
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}