import java.util.Scanner;

public class Subsegment {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean found = false;
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int n = in.nextInt();
            int  k = in.nextInt();
            int[] a =new int[n];
            for(int j = 0;j<n;j++){
                a[j] = in.nextInt();
            }

            for(int x=0;x<n;x++){
                if(a[x] == k){
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("NO");
            }
            found = false;
        }
        
    }
}
