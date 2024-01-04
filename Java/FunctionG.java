import java.util.Scanner;

public class FunctionG {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        FunctionG obj = new FunctionG();
        int size = in.nextInt();
        int[] array = new int[size];
         for(int i = 0;i<array.length;i++){
            array[i] = in.nextInt();
         }
        minArray(array);
        maxArray(array);
    }

    public static void maxArray(int[] array) {
        int max = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.print(max);
    }

    public static void minArray(int[] array) {
         int min = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print(min +" ");
    }

    

}
