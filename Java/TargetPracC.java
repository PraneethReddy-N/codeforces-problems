import java.util.Scanner;

public class TargetPracC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][]score = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
        };
         char[][] a = new char[10][10];
        int t = in.nextInt(); 
        for(int i = 0;i<t;i++){
            int ans = 0;
            for(int m = 0;m<10;m++){
                String row = in.next();
                for(int n = 0;n<10;n++){
                    a[m][n] = row.charAt(n);
                }
            }
            for(int k= 0;k<10;k++){
                for(int l = 0;l<10;l++){
                    if(a[k][l] == 'X'){
                        ans += score[k][l];
                    }
                }
            }
            System.out.println(ans);
        }

    }
}
