/*
 PROG: beads
 LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int max = 0;
        int N = Integer.parseInt(st.nextToken());
        String necklace = reader.readLine();
        necklace = necklace + necklace;
        
        for(int j = 0;j<N * 2;j++){
            int rightCount = countBeads(necklace,j+1,N);  
            int leftCount = countBeads(necklace, 0 , j+1);
            int totalCount = Math.min(rightCount, N) + Math.min(leftCount, N);
            max = Math.max(max,totalCount);
        }
        out.println(max);
        out.flush();
    }

    public static int countBeads(String necklace, int j, int n) {
        char currentColor = ' ';
        int actualcount = 0;
        int count = 0;
        for(int i = j;i<n * 2;i++){
            char currentBead = necklace.charAt(i);
            if(currentBead == 'w'){
                count++;
            }
            else if(currentColor == ' ' || currentColor == currentBead){
                count++;
            }
            else{
                if(count >= actualcount || count <= actualcount){
                    actualcount = Math.max(count,actualcount);
                    count = 1;
                    currentColor = currentBead;
                }
                continue;
            }
            if(currentColor == ' '  && currentBead != 'w'){
                currentColor = currentBead;
            }
        }
        return Math.max(actualcount, count);
    }
}

