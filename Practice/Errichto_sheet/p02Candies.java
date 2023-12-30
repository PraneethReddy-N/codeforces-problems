package Errichto_sheet;
import java.io.*;
import java.util.*;

public class p02Candies {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer s = new StringTokenizer(read.readLine());
        int n = Integer.parseInt(s.nextToken());
        String[] values = read.readLine().split(" ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(values[i]);
            //test pusj
        }
        String[] abValues = read.readLine().split(" ");
        int a = Integer.parseInt(abValues[0]);
        int b = Integer.parseInt(abValues[1]);
        int result =getCandiesCount(arr,a,b);
        out.println(result);
        out.close();
    }

    private static int getCandiesCount(int[] arr, int a, int b) {
        int sum = 0;
        for(int j = a; j<=b;j++){
            sum+= arr[j];
        }
        return sum;
    }
}
