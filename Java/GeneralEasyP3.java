import java.util.Scanner;

public class GeneralEasyP3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sumofa = 0;
        int sumofb = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
            sumofa += a[i];
        }
        for(int j =0;j<b.length;j++){
            b[j] = in.nextInt();
            sumofb += b[j];
        }
        if(sumofa == sumofb){
            System.out.println("Yes");
            
        }else{
            System.out.println("No");
        }
        in.close();
    }
}
