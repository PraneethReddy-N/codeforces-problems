import java.util.Scanner;

public class EasyProblem{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int no_of_persons = in.nextInt();
        int count = 0;
        int[] op = new int[no_of_persons];
        for(int i =0;i<no_of_persons;i++){
            op[i] = in.nextInt();
        }
        for(int j = 0; j<op.length;j++){
            if(op[j] == 1){
                System.out.println("Hard");
                System.exit(0);
            }else{
                count++;
            }
        }
        if(count>0){
            System.out.println("Easy");
        }
        in.close();
    }
}