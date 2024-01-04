import java.util.Scanner;

public class WEncrypt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String s = in.next();
        String Key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String Original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if(q ==1){
            StringBuilder encrypted = new StringBuilder();
            for (char c : s.toCharArray()) {
                int index = Original.indexOf(c);
                if (index != -1) {
                    encrypted.append(Key.charAt(index));
                } else {
                    encrypted.append(c); 
                }
            }
            System.out.println(encrypted.toString());
        } else if (q== 2) {
            
            StringBuilder decrypted = new StringBuilder();
            for (char c : s.toCharArray()) {
                int index = Key.indexOf(c);
                if (index != -1) {
                    decrypted.append(Original.charAt(index));
                } else {
                    decrypted.append(c);
                }
            }
            System.out.println(decrypted.toString());
        }
    }
}
