import java.util.Scanner;

public class VReplace {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        if(s.contains("EGYPT")){
            s = s.replaceAll("EGYPT", " ");
        }
        System.out.println(s);
    }
}
