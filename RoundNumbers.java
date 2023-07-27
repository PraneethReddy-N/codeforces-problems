import java.io.PrintWriter;
import java.util.Scanner;

public class RoundNumbers{
    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();
        // int count = 0;
        // int temp;
        // for(int i = 0;i<t;i++){
        //     int n = in.nextInt();
        //     if(n%10 == 0){
        //         System.out.println("1");
        //     }
        //     else{
        //       while(n!=0){
                
        //         count++;
        //       }
        //     }
        //      System.out.println(count);
        //      count = 0;
        // }
        // in.close();
        Scanner sc=new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);  
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int r=0;
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)!='0')
                    r++;
            }
            pw.println(r);
            int y=Integer.parseInt(s);
            int c=0;
            while (y>0){
                int u=y%10;
                y/=10;
                if(u>0){
                pw.print(u);
                for (int i = 0; i < c; i++) {
                    pw.print(0);
                }pw.print(" ");
                }
                c++;
 
            }
            pw.println();
        }
        pw.close();
    }
    }
