import java.util.Arrays;
import java.util.Scanner;

public class CodeForces1535A{
    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        int t = in.nextInt();
        int max= 0;
        int max2 =0;
        for(int i = 0;i<t;i++){
            int[]s = new int[4];
            for(int j =0;j<4;j++){
                s[j] = in.nextInt();
            }
            for(int k = 0;k<s.length/2-1;k++){
                max = Math.max(s[k], s[k+1]);
            }
            for(int a = s.length/2;a<s.length-1;a++){ 
               max2 = Math.max(s[a], s[a+1]);
            }
           Arrays.sort(s); 
           if(Math.max(max,max2) == Math.max(s[2], s[3]) && Math.min(max, max2) == Math.min(s[2], s[3])){
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
        }
    }
}