import java.util.Scanner;

public class Compare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String y = in.next();
        String str = "";
        int l1 = x.length();
        int l2 = y.length();
        int n = Math.min(l1, l2);
        for(int i = 0; i<n;i++){
            if(x.charAt(i) < y.charAt(i)){
                str = x;
                System.out.println(str);
                System.exit(0);
            }else{
                if(y.charAt(i) < x.charAt(i)){
                    str = y;
                    System.out.println(str);
                    System.exit(0);
                }
            }
        }
        if(str ==""){
            if(l1<l2){
                str = x;
            }else{
                str = y;
            }
        }
        System.out.println(str);
    }
}
