import java.util.Scanner;

public class Elephant{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a =0;
        int x = in.nextInt();
        int count;
        if(x%5 == 0){
            System.out.println(x/5);
        }else{
            System.out.println((x/5)+1);
        }
        
    }
}