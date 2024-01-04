import java.util.Arrays;
import java.util.Scanner;

public class Cses {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        boolean found = false;
        int[] n_1 = new int[n-1];
        for(int  i =0;i<n-1;i++){
            n_1[i] = in.nextInt();
        } 
        Arrays.sort(n_1);
        for(int j = 0;j<n;j++){
           num = n - j;
            for(int e : n_1){
                if(e == num){
                    found = true;
                    break;
                }
            }
            if(found == false){
                System.out.println(num);
            }
            found = false;
            num = 0;
        }
    }
}
