import java.util.Scanner;

public class Min{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total_amount = 0;
        for(int i = 0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Math.min(x,y);
            int max =Math.max(x,y);
            int ff= (x+y) * a;
            int zz = min * b +(max-min)* a ;
            System.out.println(Math.min(ff,zz));
        }
        sc.close();
    }
}