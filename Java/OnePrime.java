import java.util.Scanner;

public class OnePrime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int count = 0;
        if(X > 1){
            for(int i =1;i<=X;i++){
                if(X % i == 0){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    } 
}