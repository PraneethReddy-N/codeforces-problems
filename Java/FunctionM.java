import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FunctionM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        DistinctCount(a);
    }

    private static void DistinctCount(int[] a) {
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<a.length;i++){
            hs.add(a[i]);
        }
        System.out.println(hs.size());
    }
}
