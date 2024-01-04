import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RingRoad{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        int time = 0;
        long  j =1;
        Queue<Integer> list = new LinkedList<Integer>();
        for(int  i = 0;i<m;i++){
            list.add(in.nextInt());
        }
        while(m !=0){
            if(j > n){  
                j =1;
            }
                if(j == list.peek()){
                    m--;
                    list.poll();
                }  
                else{
                    time++;
                    j++;
                }
            }
           System.out.println(time);
            in.close();
    }
}

