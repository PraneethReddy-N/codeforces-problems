import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class problem1538A {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            StringTokenizer nval = new StringTokenizer(read.readLine());
            int n = Integer.parseInt(nval.nextToken());
            ArrayList<Integer> array = new ArrayList<>();
            String[] values = read.readLine().split(" ");
            for(int j= 0;j<n;j++){
                array.add(Integer.parseInt(values[j])); 
            }
            int min = Collections.min(array);
            int max = Collections.max(array);
             int normalCount =0;
              ArrayList<Integer> arrayCopy = new ArrayList<>(array);
            for(int k = 0 ;k<array.size();k++){
                if(array.contains(min) || array.contains(max)){
                    array.remove(k);
                    normalCount++;
                }
            } 
            int reverseCount =0 ;
            for (int x = arrayCopy.size() - 1; x >= 0; x--) {
                if (arrayCopy.contains(min) || arrayCopy.contains(max)) {
                    arrayCopy.remove(x);
                    reverseCount++;
                }
            }            
            int result = Math.min(normalCount,reverseCount);
            
            out.println(result);
        }
  out.flush();
}
}
