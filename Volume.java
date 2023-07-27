import java.util.Scanner;

public class Volume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double result = 0;
        for(int i = 0;i<n;i++){
            result = result+in.nextInt();
        }
        result = (result/100)/n;
        System.out.println(result * 100);
        in.close();
    }
}