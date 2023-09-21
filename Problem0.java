import java.util.Scanner;

public class Problem0 {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int sum = 0;
            int curr = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
             if(k > n || k > x+1){
                    System.out.println("-1");
                    continue;
                }
            for(int j = 0;j<n;j++){
               if(curr == k){
                curr = x;
               }
               if(curr > x){
                 curr = x;
               }
               if( curr == k){
                curr--;
               }
               sum += curr;
               curr++;
            }
            System.out.println(sum);
        } 
        in.close();
    }
}
