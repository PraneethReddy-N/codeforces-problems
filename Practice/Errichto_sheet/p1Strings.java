package Errichto_sheet;
import java.util.*;
import java.io.*;

public class p1Strings {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[t];
        String[] values = read.readLine().split(" ");
        for(int i = 0;i<t;i++){
            arr[i] = Integer.parseInt(values[i]);
        }   
        int[] copy = new int[t];
        getReversedArray(copy,arr);
        for(int j = 0;j<copy.length;j++){
            out.print(copy[j] + " ");
        }
        out.close();
    }

    private static int[] getReversedArray(int[] copy,int[] arr) {
        for(int i = 0;i<copy.length;i++){
            copy[i] = arr[arr.length-1-i];
        }
        return copy;
    }
}
