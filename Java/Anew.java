import java.util.Scanner;

public class Anew {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = s.indexOf('\\');
        System.out.println(s.substring(0, i));
       }
}
