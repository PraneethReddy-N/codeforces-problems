// import java.util.Scanner;

// public class FunctionI {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int x = in.nextInt();
//         int y = in.nextInt();
//         int [][] a = new int[n][n];
//         for(int i = 0;i<a.length;i++){
//             for(int j = 0;j<a.length;j++){
//                 a[i][j] = in.nextInt();
//             }
//         }
//         SwappingMatrix(a,x,y);
//          for(int i = 0;i<a.length;i++){
//                 for(int j = 0;j<a.length;j++){
//                     System.out.print(a[i][j] +" ");
//                 }
//                 System.out.println();
//     }
//     }

//     public static void SwappingMatrix(int[][] a, int x, int y) {
//         int temp;
//             for(int i = 0;i<a.length;i++){
//                 for(int j = 0;j<a.length;j++){
//                     if(i ==0){
//                          temp = a[x-1][j];
//                         a[x-1][j] = a[i][j];
//                         a[i][j] = temp; 
//                     }
//             }
//         }
//         for(int i = 0;i<a.length;i++){ 
//                     temp =  a[i][x-1];
//                     a[i][x-1] = a[i][0];
//                     a[i][0] = temp;
//             }
// }
// }
import java.util.Scanner;

public class FunctionI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        swappingMatrix(a, x, y);

        // Print the result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swappingMatrix(int[][] a, int x, int y) {
        int[][] tempRow = new int[1][a.length];
        int[][] tempCol = new int[a.length][1];

        // Swap rows
        tempRow[0] = a[x - 1].clone();
        a[x - 1] = a[y - 1].clone();
        a[y - 1] = tempRow[0].clone();

        // Swap columns
        for (int i = 0; i < a.length; i++) {
            tempCol[i][0] = a[i][x - 1];
            a[i][x - 1] = a[i][y - 1];
            a[i][y - 1] = tempCol[i][0];
        }
    }
}
