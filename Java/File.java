import java.util.HashSet;
import java.util.Scanner;
// import java.lang.StringBuilder;
import java.util.Set;

public class File{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next().toUpperCase();
        Set<Character> hs = new HashSet<>();
        hs.add('A');
        hs.add('Y'); hs.add('E'); hs.add('O'); hs.add('U'); hs.add('I');
        for(int i  = 0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                s =s.replaceAll("[AEIOUY]","");
            }
        }
        StringBuilder sb =new StringBuilder();
        for(int i =0;i<s.length();i++){
            sb.append("." + s.charAt(i));
        }
        System.out.println(sb.toString().toLowerCase());
        in.close();
    }
}