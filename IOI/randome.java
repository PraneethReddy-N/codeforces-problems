import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class randome {
    public static void main(String[] args)throws IOException{
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("2mil.out")));
        long seed = 12345; 
        Random random = new Random(seed);
        int minValue = 1;
        int maxValue = 999;
         for(long i = 0;i<100;i++){
            int randoma = random.nextInt(maxValue - minValue + 1) + minValue;
            out.println(randoma);
         }
         out.close();
    }
}
