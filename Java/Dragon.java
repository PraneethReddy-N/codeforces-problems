import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Dragon{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int kStrngth = in.nextInt();
        int n = in.nextInt();
        int[] X = new int[n] ;
        int []Y = new int[n]  ;
        int count =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            hm.put(X[i] = in.nextInt(), Y[i] = in.nextInt());
        }
        ArrayList<Integer> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);
        for(int i = 0; i< sortedKeys.size();i++)
            if(kStrngth > sortedKeys.get(i)){  
                kStrngth = kStrngth + hm.get(sortedKeys.get(i));
                count++;
            }else{
                System.out.println("NO");
                System.exit(0);
            }
        if(count  == n){
            System.out.println("YES");
        }
        in.close();
    }
}