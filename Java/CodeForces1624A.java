import java.util.Arrays;
import java.util.Scanner;

public class CodeForces1624A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i<t;i++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int  j = 0;j<a.length;j++){
                a[j] = in.nextInt();
            }
            int max = Arrays.stream(a).max().getAsInt();
            int min = Arrays.stream(a).min().getAsInt();

            System.out.println(max - min);

        }
		// for (int tc = 0; tc < t; tc++) {
			
		// 	int n = in.nextInt();
		// 	long[] arr = in.nextLong(n);
			
		// 	long max = Arrays.stream(arr).max().getAsLong();
		// 	long min = Arrays.stream(arr).min().getAsLong();
			
		// 	System.out.println(max - min);
		// }
        // int t = in.nextInt();
        // int count = 0;
        // int max = 0;
        // for(int i = 0;i<t;i++){
        //     int n = in.nextInt();
        //      int[] a = new int[n];
        //     for(int k = 0;k<n;k++){   
        //         a[k] = in.nextInt();
        //     }
        //     max = Arrays.stream(a).max().getAsInt();
        //     for(int j = 0;j<a.length;j++){
        //         while(a[j] != max){
        //             for(int z = 0;z<a.length;z++){
        //                 if(a[z] != max){
        //                     a[z] += 1;
        //                 }
        //             }
        //             count++;
        //         }
        //     }
        //     System.out.println(count);
        //     max =0;
        //     count = 0;
        // }
       	 in.close();
	}
    }
