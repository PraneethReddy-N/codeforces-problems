import java.util.*;
public class LongWords{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0;i<n;i++){
            String s = in.next();
            int l = s.length();
            if(l <= 10){
                System.out.println(s);
            }
            else{
                System.out.println(s.charAt(0)+""+(l-2)+""+s.charAt(l-1));
            }
        }
        in.close();
    }
}