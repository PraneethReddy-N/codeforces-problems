/*
 PROG: ride
 LANG: JAVA
 */

import java.io.*;
import java.util.*;

public class ride {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        int f1 = 1;
        int f2 = 1;
        int number = -1;
        String Line;
        while((Line = f.readLine()) != null){
             StringTokenizer st = new StringTokenizer(Line);
        while(st.hasMoreTokens()){
             String to = st.nextToken();
             if(number == 0){
                f2 = f1;
                f1 = 1;
             }
             for(int i = 0;i<to.length();i++){
              char c = to.charAt(i);
             switch (c) {
                case 'A':
                      number  = 1;
                    break;
                case 'B':
                    number = 2;
                    break;
                    case 'C':
                    number  = 3;
                    break;
                case 'D':
                    number = 4;
                    break;
                    case 'E':
                    number  = 5;
                    break;
                case 'F':
                    number = 6;
                    break;
                    case 'G':
                      number  = 7;
                    break;
                case 'H':
                    number = 8;
                    break;
                    case 'I':
                       number = 9;
                    break;
                case 'J':
                    number = 10;
                    break;
                    case 'K':
                        number= 11;
                    break;
                case 'L':
                    number = 12;
                    break;
                    case 'M':
                       number = 13;
                    break;
                    case 'N':
                       number = 14;
                    break;
                case 'O':
                    number = 15;
                    break;
                     case 'P':
                       number = 16;
                    break;
                case 'Q':
                    number = 17;
                    break;
                     case 'R':
                      number  = 18;
                    break;
                case 'S':
                    number = 19;
                    break;
                     case 'T':
                       number = 20;
                    break;
                case 'U':
                    number = 21;
                    break;
                                        
                 case 'V':
                      number  = 22;
                    break;
                case 'W':
                    number = 23;
                    break;
                     case 'X':
                      number  = 24;
                    break;
                case 'Y':
                    number = 25;
                    break;
                     case 'Z':
                    number  = 26;
                    break; 
        }
         f1 *= number;
         number = 0;
    }
}
    }
    if(f1 % 47 ==  f2 % 47){
        out.println("GO");
    } else{
        out.println("STAY");
    }
        out.close();
}
}
