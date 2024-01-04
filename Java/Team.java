import java.util.Scanner;

public class Team{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a;int b;int c;
        int count = 0;
        for(int i = 0;i<n;i++){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a>0 && b>0 || b>0 &&c>0 ||c>0 &&a>0){
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}