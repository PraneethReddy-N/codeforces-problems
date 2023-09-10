import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
           char c = s.charAt(i);
          if(Character.isLowerCase(c)){
            str.append(Character.toUpperCase(c));
          }
          else if(Character.isUpperCase(c)){
            str.append(Character.toLowerCase(c));
          } else if (c == ',') {
            str.append(" ");
        } 
    }
        System.out.println(str);
    }
}
