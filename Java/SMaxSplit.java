import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMaxSplit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int countOfL = 0;
        int countOfR = 0;
        List<String> substrings = new ArrayList<>();
        String ss = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                countOfL++;
            }
            else if(s.charAt(i) == 'R'){
                countOfR++;
            }
            ss+= s.charAt(i);
            if(countOfL == countOfR){
                substrings.add(0, ss);
                countOfL = 0;
                countOfR = 0;
                ss = "";
            }
        }
        System.out.println(substrings.size());
        for(int j = substrings.size()-1;j>=0;j--){
            System.out.println(substrings.get(j));
        }
        
    }
}
