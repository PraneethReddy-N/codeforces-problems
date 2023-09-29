
    import java.io.*;
import java.util.*;


public class Chips {
    public static void main(String[] args)throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        int t = Integer.parseInt(f.readLine());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(f.readLine());
            int [] a = new int[n];
            int [] b = new int[n];
            for(int j = 0;j<n;j++){
                a[i] = f.read();
            }
            for(int k = 0;k<n;k++){
                b[i] = f.read();
            }
            
        }

}
}
