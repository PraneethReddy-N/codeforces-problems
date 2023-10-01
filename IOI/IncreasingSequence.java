import java.io.*;
import java.util.*;

public class IncreasingSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(f.readLine());
            int[] a = new int[n];
            StringTokenizer arrayTokens = new StringTokenizer(f.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(arrayTokens.nextToken());
            }
            
            int count = 0;
            int max = a[0];
            for (int k = 1; k < a.length; k++) {
                if (max >= a[k]) {
                    count++;
                }
                max = Math.max(max, a[k]);
            }
            if (a[0] != 1 || a[n - 1] != n) {
                count = Math.max(count, 1);
            }
            out.println(count);
        }
        out.flush();
    }
}
