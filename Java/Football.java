import java.util.Scanner;

public class Football{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        int countprev =0;
         String res = "";
        String[] array = new String[n];
        for(int i =0;i<n;i++){
            array[i] = in.next();
        }
        
        for(int  i = 0;i<n;i++){
            if(n == 1){
            System.out.println(array[i]);
            System.exit(0);
        }
            for(int j = i+1;j<n;j++){
                if(array[j].equals(array[i])){
                    count++;
                }
            }
            if(count > countprev){
                countprev = count;
                count = 0;
                res = array[i];
                
            }
        }
        System.out.println(res);
        in.close();
    }
}