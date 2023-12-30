import java.util.*;
import java.io.*;
public class problem1881C {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(read.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i = 0;i<t;i++){
            StringTokenizer nval = new StringTokenizer(read.readLine());
            int n = Integer.parseInt(nval.nextToken());
            char[][] arr = new char[n][n];    
            for(int j = 0;j<n;j++){
                String line = read.readLine();
                for(int k = 0;k<n;k++){
                    arr[j][k] = line.charAt(k);
                }
            } 
            
            char [][] arrCopy = new char[n][n];
            arrCopy = rotate90Degrees(arr);
            int operations = 0;
            while (!areMatricesEqual(arr, arrCopy)) {
            for(int m = 0;m<arr.length;m++){
                for(int l = 0;l<arr.length;l++){
                    if(arr[m][l] != arrCopy[m][l] && arr[m][l] < arrCopy[m][l] && arr[m][l] != 'z'){
                        operations ++;
                        arr[m][l] += 1;
                    }
                }
            } 
            arrCopy = rotate90Degrees(arr);
        }
        out.println(operations);
    }
        
        out.flush();
}
  public static boolean areMatricesEqual(char[][] matrix1, char[][] matrix2) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static char[][] rotate90Degrees(char[][] arr) {
            int n = arr.length;
            char[][] arrCopy = new char[n][n];
        
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    arrCopy[y][n-1-x] = arr[x][y];
                }
            }
        
            return arrCopy;
        }
        

}