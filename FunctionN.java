import java.util.ArrayList;
import java.util.Scanner;

public class FunctionN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]= in.nextInt();
        }
        shiftZeros(a);
    }

    private static void shiftZeros(int[] a) {
        ArrayList<Integer> arr = new ArrayList<Integer>(a.length);
        for(int i = 0;i<a.length;i++){
            if(a[i] != 0){
                arr.add(a[i]);
            }
        }
        while (arr.size() < a.length) {
            arr.add(0);
        }

        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
      
    }
}
