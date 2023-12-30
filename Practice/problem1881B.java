import java.io.*;
import java.util.*;

public class problem1881B {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            long[] arr = new long[3];
            StringTokenizer st1 = new StringTokenizer(read.readLine());
              boolean found = false;
              for (int j = 0; j < 3; j++) {
                arr[j] = Long.parseLong(st1.nextToken());
            }
            Arrays.sort(arr);
            long a = arr[0];
            long b = arr[1];
            long c = arr[2];
            int noOfOperations = 3;
                if(a == b && b == c && c ==a){
                    out.println("Yes");
                    found = true;
                    continue;
                }
                else if( a == b && b !=c && c!= a){
                    while(noOfOperations-- !=0 && c != a){
                        c -= a;
                    }
                    if(a == b && b == c && c ==a){
                        out.println("Yes");
                        found = true;
                        continue;
                    }
                }
                else {
                    while(noOfOperations -- != 0){
                        if( b != a && a < b ){
                            b -= a;
                        }
                        else{
                            if(c != a){
                                 c -= a;
                            }
                        }
                    }
                     if(a == b && b == c && c ==a){
                        out.println("Yes");
                        found = true;
                        continue;
                    }
                }
            if(!found){
                out.println("NO");
            }
        }
        out.flush();
}
}
