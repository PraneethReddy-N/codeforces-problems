import java.util.Scanner;

public class TleDay3P3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 0;
        String f1 = in.next();
        String L1 = in.next();
        String f2 = in.next();
        String l2 = in.next();
        for(int i = 0;i<L1.length();i++){
            if(L1.charAt(i) == l2.charAt(i)){
                count++;
            }
            else{
                System.out.println("NOT");
                System.exit(0);
            }
        }
        if(count == L1.length()){
            System.out.println("ARE Brothers");
        }
    }
}