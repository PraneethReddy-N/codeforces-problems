import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class div21875B {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int sum = 0;
            long n = in.nextLong();
            long m = in.nextLong();
            long k = in.nextLong();
            Integer[] jellyFish = new Integer[(int)n];
            Integer[] gellyfish = new Integer[(int) m];
            for(int j = 0;j<jellyFish.length;j++){
                jellyFish[j] = in.nextInt();
            }
            for(int z = 0;z<gellyfish.length;z++){
                gellyfish[z] = in.nextInt();
            }
            Arrays.sort(gellyfish, Collections.reverseOrder());
            Arrays.sort(jellyFish);
            int max = gellyfish[0];
                if( k % 2 != 0){
                    if(max > jellyFish[0]){
                         jellyFish[0] = max;
                    }
                }
                 for(int l =0 ;l<jellyFish.length;l++){
                        sum+= jellyFish[l];
            }
            System.out.println(sum);  
        }
        in.close();
    }
}
