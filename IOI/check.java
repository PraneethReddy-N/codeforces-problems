import java.io.*;
import java.util.*;

public class check {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("2mil.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("reads.out")));
        String giver;
        long seed = 12345; 
        Random random = new Random(seed);
        int minValue = 1;
        int maxValue = 999;
        while((giver = f.readLine()) !=null){
            StringTokenizer st =  new StringTokenizer(giver);
            while(st.hasMoreTokens()){
              int ss = Integer.parseInt(st.nextToken());
                for(int i = 0;i<100;i++){
                    int z =random.nextInt(maxValue - minValue + 1) + minValue;
                    if(z == ss ){
                        out.println("Yes");
                    }else{
                        out.println("No");
                    }
                }
            }
        }
        out.close();
    }
}