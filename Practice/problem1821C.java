import java.io.*;
import java.util.*;
public class problem1821C {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            String Line = read.readLine();
            StringBuilder new1 = new StringBuilder(Line);
            char maxChar = getMaxChar(Line);
            int maxCharCount = getCount(Line, maxChar);
            int maxOperations = 0;
            while(new1.length() != maxCharCount){
                for(int j =0;j<new1.length();){
                    
                }
                maxOperations++;
            }
            out.println(maxOperations);
        }
out.close();

    }

    private static int getCount(String s, char maxChar) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == maxChar) {
                count++;
            }
        }
        return count;
    }

    private static char getMaxChar(String line) {
        int[] arr = new int[26];
        for(int i = 0;i<line.length();i++){
            arr[line.charAt(i) - 'a']++;
        }
        int maxIndex = 0;
        for(int i = 1;i<26;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return (char) ('a' + maxIndex);
    }
}
