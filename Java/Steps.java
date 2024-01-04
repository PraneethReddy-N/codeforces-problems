import java.util.Scanner;

public class Steps{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int no_of_steps = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        if(no_of_steps < m){
        System.out.println("-1");
        System.exit(0);
       }
        if(no_of_steps % 2 == 0){
            for(int i=0;i<=no_of_steps/2;i++){
                if((no_of_steps/2+i)%m==0){
                    System.out.println(no_of_steps/2+i);
                    count++;
                    break;
                }
            }
        }
        else {
            for(int i=0;i<=no_of_steps/2;i++){
                if((no_of_steps/2+1+i)%m==0){
                    System.out.println(no_of_steps/2+1+i);
                    count++;
                    break;

                }
            }
        }
        in.close();
    }
}