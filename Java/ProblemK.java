import java.util.Scanner;

public class ProblemK {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        for(int j = 0;j<z;j++){
        String s = in.next();
        String t = in.next();
        String res = "";
        int total = s.length() + t.length();
        for(int i =0;i<total;i++){
            if(res.length() == total){
                System.out.println(res);
                break;
            }
            else{
            if(i>= s.length()){
                res+="" + t.charAt(i);
            }
             else if(i>= t.length()){
                res+="" + s.charAt(i);
            }
            else{
                res += s.charAt(i) +""+t.charAt(i);
            }
        }
    }
    }
}
}
