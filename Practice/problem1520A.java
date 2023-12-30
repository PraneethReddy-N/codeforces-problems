import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer; 

public class problem1520A  {
      public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st= new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
             Set<Character> set = new HashSet<Character>(); 
             boolean flag= true;
            StringTokenizer stringVal = new StringTokenizer(read.readLine());
            int n = Integer.parseInt(stringVal.nextToken());
            String val  = read.readLine();
            for(int j = 0;j<n;j++){
                if(set.contains(val.charAt(j)) &&  val.charAt(j-1) != val.charAt(j)){
                        flag = false;
                        break;
                }
                set.add(val.charAt(j));
            }
            if(flag){
                out.println("YES");
            }
            else{
                out.println("NO");
            }
        }
        out.close();
}

}
