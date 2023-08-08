import java.util.Scanner;

public class RangeSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ;i <t;i++){
            Long l = in.nextLong();
            Long R = in.nextLong();
            Long max =Math.max(l,R);
            Long min = Math.min(l,R);
            min--;
            long res1 = min *(min+1)/2;
            long res2 = max *(max + 1)/2;
            System.out.println(res2 -res1);
        }
    in.close();
    }
}