import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        if(A % B == 0 || B % A ==0){
            System.out.println("Multiples");
        }
        else{
            System.out.println("No Multiples");
        }
    }
    
}
