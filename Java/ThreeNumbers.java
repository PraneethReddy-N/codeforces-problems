import java.util.Scanner;

public class ThreeNumbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long k = in.nextLong();
        Long s = in.nextLong();
        int count = 0;
        for (int X = 0; X <= k; X++) {
            for (int Y = 0; Y <= k; Y++) {
                Long Z = s - X - Y;
                if (Z >= 0 && Z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}