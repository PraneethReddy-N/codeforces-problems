import java.io.*;
import java.util.*;
public class problem1883B {
    public static void main(String[] args)throws Exception{
        try{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            String[] nkValues = read.readLine().split(" ");
            int n = Integer.parseInt(nkValues[0]);
            int k = Integer.parseInt(nkValues[1]);
            StringTokenizer string = new StringTokenizer(read.readLine());
            String s = string.nextToken();
            int[ ] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for(int j = 0;j<s.length();j++){
                count[s.charAt(j) - 'a']++;
            }
            HashMap<Character,Integer> hm = new HashMap<>();
           for(int z = 0 ;z<count.length;z++){
            if(count[z] > 0){
                hm.put((char) (z + 'a'), count[z]);
            }
           }
    
                int temp = k;
                for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                    int val = entry.getValue();
                    while (temp > 0 && val > 0 && val % 2 != 0) {
                        val--;
                        temp--;
                    }
                    entry.setValue(val);
                }
                if( temp !=0){
                for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                    int val = entry.getValue();
                    while (temp > 0 && val > 0) {
                        val--;
                        temp--;
                    }
                    entry.setValue(val);
                    if (temp == 0) {
                        break;
                    }
                }
            }
            int oddCount = 0;
            for (int val : hm.values()) {
                 if (val % 2 != 0) {
                    oddCount++;
                }
            }
        if ((n - k) % 2 == 0) {
             if (oddCount == 0) {
                 out.println("YES");
             } else {
                    out.println("NO");
                }
        } else {
             if (oddCount == 1) {
                 out.println("YES");
            } else {
                out.println("NO");
            }
        }     
        }
        out.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
}
    

