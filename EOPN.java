import java.util.Scanner;

public class EOPN{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();
        int count = 0;
        int oddcount = 0;
        int poscount = 0;
        int negcount = 0;
        long [] num = new long[N];
        for(int i =0;i<N;i++){
            num[i] = in.nextInt();
        }
        for(int j= 0;j<num.length;j++){
            if(num[j]%2 == 0){
                count++;
            }else{
                oddcount++; 
            }
            if(num[j] >0){
                poscount++;
            }
            else if(num[j]<0){
                negcount++;
            }
        }
        System.out.println("Even: " + count);
        System.out.println("Odd: " + oddcount);
        System.out.println("Positive: " + poscount);
        System.out.println("Negative: " + negcount);
        in.close();
    }
}