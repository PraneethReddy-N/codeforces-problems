import java.util.*;
import java.io.*;

public class setsUnion {
    public static void main(String[] args)throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("union.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("union.out")));
        
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        int[] count = new int[50];
        int ans = 0;
        StringTokenizer st = new StringTokenizer(f.readLine());
            int t = Integer.parseInt(st.nextToken());
            for(int i = 0;i<t;i++){
                StringTokenizer nval = new StringTokenizer(f.readLine());
                int n = Integer.parseInt(nval.nextToken());
                for(int j=0;j<n;j++){
                    String[] k = f.readLine().split(" ");
                    int kval = Integer.parseInt(k[0]);
                    for(int m= 1;m<=kval;m++){
                        ls.add(Integer.parseInt(k[m]));
                        count[Integer.parseInt(k[m])]++;
                    }
                }


                 out.println(ls.size());
                ls.clear();
            }
         out.flush();
    }
        
    }

