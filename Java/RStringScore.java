import java.util.Scanner;

public class RStringScore {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder str = new StringBuilder(in.next());
        int score = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'V'){
                score += 5;
            }
            else if(str.charAt(i) == 'W'){
                score += 2;
            }
            else if(str.charAt(i) == 'X'){
                if(i+1<str.length()){
                str.deleteCharAt(i+1);
                }
            }
            else if(str.charAt(i) == 'Y' ){
                if(i+1 <str.length()){
               int index = str.indexOf(""+str.charAt(i+1));
               if (index != -1) {
                    char charToMove = str.charAt(index);
                    str.deleteCharAt(index);
                    str.append(charToMove);
                }
            }
            }
            else if(str.charAt(i) == 'Z' ){
                if(i+1 <str.length()){
                  if(str.charAt(i+1) =='V') {
                    score /= 5;
                    str.deleteCharAt(i+1);
                  }
                  else if(str.charAt(i+1) == 'W'){
                    score /=2;
                    str.deleteCharAt(i+1);
                  }
                }
            }
        }
        System.out.println(score);
    }
}
