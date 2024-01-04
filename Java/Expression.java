import java.util.Scanner;

public class Expression{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char s = in.next().charAt(0);
        int b = in.nextInt();
        char q = in.next().charAt(0);
        int c = in.nextInt();

        if(s == '+'){
            if(a + b == c){
                System.out.println("Yes");
            }
            else{
                System.out.println(a + b);
            }
        }
        else if(s == '-'){
            if(a - b == c){
                System.out.println("Yes");
            }
            else{
                System.out.println(a - b);
            }
        }
        else if(s == '*'){
            if(a * b == c){
                System.out.println("Yes");
            }
            else{
                System.out.println(a * b);
            }
        }
    }
}