
import java.util.Scanner;

public class NewYear{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),t=in.nextInt();
            int a[]=new int[n+1];
            for(int i=1;i<n;i++)
            {
                a[i]=in.nextInt();
            }
             in.close();
            int index=1;
            while(true)
            {
                if(index==t)
                {
                    System.out.println("YES");
                    return;
                }
                if(t<index)
                {
                    System.out.println("NO");
                    return;
                }
                index=index+a[index];
            }     
    }
}