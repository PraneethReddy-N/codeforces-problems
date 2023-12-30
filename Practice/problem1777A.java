import java.io.*;
import java.util.*;
public class problem1777A {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(read.readLine());
            StringTokenizer arrayVal = new StringTokenizer(read.readLine());
            ArrayList<Long> array = new ArrayList<>();
            while(arrayVal.hasMoreTokens()){
                array.add((long) Integer.parseInt(arrayVal.nextToken()));
            }
            int operations = 0;
             int k = 0;
                while(!hasDifferentParity(array)){
                        if((array.get(k) & 1) != 0 && (array.get(k+1) & 1) != 0){
                            array.set(k,  array.get(k) * array.get(k+1));
                            array.remove(k+1);
                            operations++;
                        }
                        else if((array.get(k) & 1) == 0 && (array.get(k+1) & 1) == 0){
                            array.set(k,array.get(k) * array.get(k+1));
                            array.remove(k+1);
                            operations++;
                        }
                        else{
                            k++;
                        }
                }
            
            out.println(operations);
        }
        out.close();
    }
   
    private static  boolean hasDifferentParity(ArrayList<Long> array){
        for(int j = 0;j<array.size()-1;j++){
            if((array.get(j) & 1) == 0 && (array.get(j+1) & 1) == 0){
                return false;
            }
            else if((array.get(j) & 1) != 0 && (array.get(j+1) & 1) != 0){
                return false;
            }
        }
        return true;
    } 


}
