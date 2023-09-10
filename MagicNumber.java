import java.util.Scanner;

public class MagicNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        Boolean flag = true;
        String s = String.valueOf(n);
        for(int i = 0;i<s.length();){
            if(i + 2 < s.length() && s.charAt(i) =='1' && s.charAt(i+1) =='4'&&s.charAt(i+2) =='4'){
                i+=3;
            }
            else if(i + 1 < s.length() && s.charAt(i) == '1' &s.charAt(i+1) == '4' ){
                i+=2;
            }
            else if(s.charAt(i) =='1'){
                i++;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{System.out.println("NO");}
        
    }
}