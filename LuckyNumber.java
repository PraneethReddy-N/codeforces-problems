import java.util.Scanner;

public class LuckyNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = "NO";
        int[] array = {4,7,47,74,77,44,444,777,477,774,774,447};
        for(int i = 0; i< array.length;i++){
        if(n % array[i] == 0){
           res = "YES";
        }
    }
    System.out.println(res);
    }
}