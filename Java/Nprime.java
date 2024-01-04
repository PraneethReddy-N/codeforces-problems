import java.util.Scanner;

public class Nprime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       for(int i =2;i<=n;i++){
        int prim = 0;
        for(int j = 2;j<i;j++){
            if(i%j==0){
                prim = 1;
                break;
            }
        }
        if(prim == 0){
            System.out.print(i + " ");
        }
       }
    }
}