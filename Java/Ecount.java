import java.util.Scanner;

public class Ecount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum = 0;
        for(int i =0;i<s.length();i++){
        char c =s.charAt(i);
        sum+=Integer.parseInt(""+ c);
        }
        System.out.println(sum);
    }
}
