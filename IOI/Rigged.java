import java.io.*;
import java.util.*;


public class Rigged {
    public static void main(String[] args)throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        // BufferedReader f = new BufferedReader(new FileReader("Rigged.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Rigged.out")));
        int t = Integer.parseInt(f.readLine());
        for(int i =0;i<t;i++){
            int n = Integer.parseInt(f.readLine());
            String[] parts = f.readLine().split(" "); 
            long strength = Long.parseLong(parts[0]); 
            long endurance = Long.parseLong(parts[1]);
            long weight = strength;
            boolean encounteredBreak = false;
            for(int j = 1;j<n;j++){
                String[] part = f.readLine().split(" ");
                long strengthcompare  = Long.parseLong(part[0]);
                long enduranceCompare = Long.parseLong(part[1]);
                if(strengthcompare > strength && enduranceCompare > endurance){
                    out.println("-1");
                    encounteredBreak = true;
                    break;
                }
                else if(strengthcompare == strength && enduranceCompare == endurance){
                    out.println("-1");
                    encounteredBreak = true;
                    break;
                }
                else if(strengthcompare >strength && enduranceCompare <endurance){
                    continue;
                }
                else if(strengthcompare < strength && enduranceCompare <= endurance || enduranceCompare>=endurance){
                    continue;
                }
            }
            if (!encounteredBreak) {
                out.println(weight);
            }
        }
        out.close();
    }
}

   
