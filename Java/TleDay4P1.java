import java.util.Scanner;

public class TleDay4P1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char x = in.next().charAt(0);
        int num = (int) x;
        if(num >=65 && num<=90){
            num += 32;
            x = (char) num;
            System.out.println(x);
        }
        else{
            num -= 32;
            x = (char) num;
            System.out.println(x);
        } 
        in.close();       
    }
}