/*
 PROG: gift1
 LANG: JAVA
 */

import java.io.*;
import java.util.*;


public class gift1 {
    public static void main(String[] args)throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        int np = Integer.parseInt(f.readLine());
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
            // StringTokenizer st = new StringTokenizer(f.readLine());
                for(int i = 0;i<np;i++){
                    String groupppl = f.readLine();
                     map.put(groupppl,0);
                }
                String giver;
                while((giver = f.readLine()) != null){
                    int each=0;
                    int remaining=0;
                    StringTokenizer st = new StringTokenizer(f.readLine());
                    int TotalAmount = Integer.parseInt(st.nextToken());
                    int numofppl = Integer.parseInt(st.nextToken());
                    if(numofppl>0){
                        each  = TotalAmount/numofppl;
                    remaining = TotalAmount % numofppl;
                    }
                    for(int i = 0;i<numofppl;i++){
                        String reciever = f.readLine();
                      map.put(reciever,map.get(reciever)+each);
                    }
                    map.put(giver,map.get(giver)-TotalAmount+remaining);
                }
       for(Map.Entry<String,Integer> e : map.entrySet()){
           out.println(e.getKey() +" " + e.getValue());
       }
       out.close();
    }
}
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;

// public class friday {
//     public static void main(String[] args)throws IOException{
//         BufferedReader f = new BufferedReader(new FileReader("friday.in"));
//         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
//         int startYear = 1900;
//         int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//         int[] ThirteenCount = {0,0,0,0,0,0,0};
//         String[] week = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","friday"};
//         int n = Integer.parseInt(f.readLine());
//         int dayIndex = 2;
//         for(int year =1900;year<1900+n;year++){
//             if(year % 4 == 0){
//                 if(year % 100 !=0 || year % 400 == 0){
//                     monthDays[1] += 1;
//                 }
//             }
//             for(int month = 0;month<12;month++){
                
//                     for(int i = dayIndex;i<7;i++){
//                         if(monthDays[month] == 13){
//                             ThirteenCount[i]++;
//                             break;
//                         }
//                         dayIndex++;
//                         monthDays[month]--;
//                     }
//                     dayIndex = 0;
                
//             }
//         }
//          for(int i = 0;i<7;i++){
//             out.print(ThirteenCount[i]);
//               if (i < 6) {
//                 out.print(" ");
//             }
//         }
//         out.println();

//         out.close();
//          }   
        
//     }