import java.util.*;
import java.io.*;
public class problem1884A {
    public static void main(String[] args)throws Exception{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            String[] values = read.readLine().split(" ");
            boolean found = false;
            int x = Integer.parseInt(values[0]);
            int k = Integer.parseInt(values[1]);
            while(!found){
                int number  = sumOfDigits(x);
                if(number % k == 0){
                    out.println(x);
                    found = true;
                }
                else{
                    x++;
                }
            }
        }
        out.close();
}
public static int sumOfDigits(int number) {
    int sum = 0;
    
    while (number > 0) {
        sum += number % 10;  
        number /= 10;      
    }
    
    return sum;
}
}
