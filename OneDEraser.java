import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s = "";
        for(int i = 0;i<t;i++){
            int n = in.nextInt();
            int k = in.nextInt();
            for(int j =0;j<n;j++){
                s += in.next();
            }
            int operations = 0;
            int consecutiveBlack = 0;
    
            for (int q = 0; q < n; q++) {
                if (s.charAt(q) == 'B') {
                    consecutiveBlack++;
                } else {
                    operations += (consecutiveBlack + k - 1) / k;
                    consecutiveBlack = 0;
                }
            }
            if (consecutiveBlack > 0) {
                operations += (consecutiveBlack + k - 1) / k;
            }
            System.out.println(operations);
           
        }
    }
}
