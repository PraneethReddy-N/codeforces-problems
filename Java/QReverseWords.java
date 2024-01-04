import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class QReverseWords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
         String word;
         boolean isFirstWord = true;
        StringTokenizer iss = new StringTokenizer(s);
 
        while (iss.hasMoreTokens()) {
            word = iss.nextToken();
            if (!isFirstWord) {
                System.out.print(" "); 
            }
            System.out.print(new StringBuilder(word).reverse().toString());
            isFirstWord = false;
        }
    }
    }
