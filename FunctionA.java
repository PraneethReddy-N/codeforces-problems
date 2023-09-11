import java.util.Scanner;

public class FunctionA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // int x  = in.nextInt();
        // int  y = in.nextInt();
        int t = in.nextInt();
        // int n = in.nextInt();
        for(int i = 0;i<t;i++){
            int n = in.nextInt();
            if(isPrime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        // Wonderful(n);
        // print(n);
        // addition(x,y);
    }
    // public static void addition(int x, int y){
    //     int sum = 0;
    //     sum = x + y;
    //     System.out.println(sum);
    // }

    // public static void print(int n){
    //     for(int i =1;i<n;i++){
    //         System.out.print(i+ " ");
    //     }
    //     System.out.print(n);
    // }

    // public static void Wonderful(int n){
    //     if(n % 2 == 0){
    //         System.out.println("NO");
    //     }else{
    //         palindrome(n);
    //     }
    // }
    // public static void palindrome(int n){
    //     String binaryRepresentation = Integer.toBinaryString(n);
    //     String reversed = new StringBuilder(binaryRepresentation).reverse().toString();
    //     if(binaryRepresentation.equals(reversed)){
    //         System.out.println("YES");
    //     }else{
    //         System.out.println("NO");
    //     }
    // }

    public static boolean isPrime(int n){
            if( n <=1){
                System.out.println("NO");
            }
            else{
                for(int j =2;j<n;j++){
                    if(n % j == 0){
                        return false;
                    }    
                }
                
            }
            return true;
        } 
    }

    

