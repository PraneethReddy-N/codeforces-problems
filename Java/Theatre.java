import java.util.*;
public class Theatre{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
       
        // for(int i =0;i< c;i++){
        //     long b =  (long) n;
        //     while(b > 0){
        //         count++;
        //         b = (long) (b-a);
        //     }
        // }
        System.out.println((long)Math.ceil((double) n/a)*(long)Math.ceil((double) m/a));
    }
}