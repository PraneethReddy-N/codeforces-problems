package Errichto_sheet;
import java.util.*;
import java.io.*;


    

public class random {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int n = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        String[] values = read.readLine().split(" ");
        for(int i = 0;i<n;i++){
            minHeap.add(Integer.parseInt(values[i]));
        }
        int k = Integer.parseInt(read.readLine());
        for(int j = 0;j<k;j++){
            int largest = minHeap.poll();
            largest = (int) Math.ceil(largest / 2.0);
            minHeap.add(largest);
        }
        int sum = 0;
        while (!minHeap.isEmpty()) {
            sum += minHeap.poll();
        }
        out.println(sum);
        out.close();
}
}
