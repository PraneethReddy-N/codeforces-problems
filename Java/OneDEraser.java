import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        int operations = 0;
        for (int i = 0; i < t; i++) {
            String[] line = in.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            
            String s = in.nextLine();

            for (int q = 0; q < n; q++) {
                if (s.charAt(q) == 'B') {
                    operations++;
                    q += k - 1;
                } 
            }
            
            System.out.println(operations);
            operations = 0;
        }
    }
}

