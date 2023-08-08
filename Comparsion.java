import java.util.Scanner;

public class Comparsion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char s = in.next().charAt(0);
        int b = in.nextInt();
        if(s == '>'){
            if(a > b){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
        }
        else if(s == '<'){
            if(a < b){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
        }
        else if(s =='='){
            if(a == b){
                System.out.println("Right");
            }
            else{
                System.out.println("Wrong");
            }
        }
    }
}
