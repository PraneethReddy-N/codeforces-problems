import java.util.Arrays;
import java.util.Scanner;

public class CodeForces723A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] x = new int[3];
        int count = 0;
        for(int i = 0; i<x.length;i++){
            x[i] = in.nextInt();
        }       
        Arrays.sort(x);
        for(int i = 0; i <x.length-1;i++){
            count += x[i+1]-x[i];
        }

        System.out.println(count);
        in.close();


    }
}