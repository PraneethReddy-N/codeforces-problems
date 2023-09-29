/*
 PROG: friday
 LANG: JAVA
 */

import java.io.*;
import java.util.*;

public class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("friday.in"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int N = Integer.parseInt(reader.readLine().trim());
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] dayCount = new int[7];
        int currentDay = 0; 

        for (int year = 1900; year < 1900 + N; year++) {
            for (int month = 0; month < 12; month++) {
                dayCount[currentDay]++; 
                int daysInCurrentMonth = daysInMonth[month];
                if (month == 1 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                    daysInCurrentMonth++;
                }
                currentDay = (currentDay + daysInCurrentMonth) % 7;
            }
        }
        for (int i = 0; i < 7; i++) {
            writer.print(dayCount[i]);
            if (i < 6) {
                writer.print(" ");
            }
        }
        writer.println();

        reader.close();
        writer.close();
    }
}

