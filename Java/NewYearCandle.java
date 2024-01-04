import java.util.Scanner;

public class NewYearCandle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int no_of_candles = in.nextInt();
        int hours = 0;
        int count_needed_to_make_new = in.nextInt();
        int went_out_candles = 0 ;
        while(no_of_candles !=0){
            hours++;
            went_out_candles++;
            no_of_candles--;
            if(went_out_candles == count_needed_to_make_new){
                no_of_candles++;
                went_out_candles = 0;
            }
        }
        System.out.println(hours);
        in.close();
    }
}