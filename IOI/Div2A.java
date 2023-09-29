import java.util.Scanner;

public class Div2A {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        boolean encounteredBreak = false;
        long max = -1;
        long mmax = 0;
        for(int i = 0;i< t;i++){
            int n = in.nextInt();
            long[]s = new long[n];
            long[]e = new long[n]; 
            for(int j =0;j<n;j++){
               s[j] = in.nextLong();
               e[j] = in.nextLong();
            }
            for(int k = 0;k<n;k++){
                max = s[0];
              if(s[i] > max){
                mmax = Math.max(mmax, e[i]);
              }
            }
           if(e[0] > mmax ){
            System.out.println(max);
           }else{
            System.out.println("-1");
           }
            }
        }
    }
    

