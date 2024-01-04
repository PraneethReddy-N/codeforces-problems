import java.util.Scanner;
public class UNewWords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next().toLowerCase();
        int words = 0;
        int e = 0;int g = 0 ;int y = 0; int p = 0;int t = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                e++;
            }
            else if(str.charAt(i) == 'g'){
                g++;
            }
            else if(str.charAt(i) == 'y'){
                y++;
            }
            else if(str.charAt(i) == 'p'){
                p++;
            }
            else if(str.charAt(i) == 't'){
                t++;
            }
        }
        while(e > 0 && g > 0 && y>0 && p>0 && t >0){
            e--;g--;y--;p--;t--;
            words++;
        }
        System.out.println(words);
    }
}


