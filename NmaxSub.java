import java.util.Scanner;

public class NmaxSub {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        String res =""+str.charAt(0);
        int count = 1;
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i-1) != str.charAt(i)){
                res+=str.charAt(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
