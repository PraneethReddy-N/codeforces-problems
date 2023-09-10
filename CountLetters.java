import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// public class CountLetters {
//     //https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/J
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         String s = in.next(); 
//         HashMap<Character,Integer> count = new HashMap<>();
//         char [] sarray = s.toCharArray();
//         for(char c : sarray){
//             if(count.containsKey(c)){
//                 count.put(c, count.get(c)+1);
//             }
//             else{
//                 count.put(c, 1);
//             }
//         }
//         ArrayList<Character> sorted = new ArrayList<>(count.keySet());
//         Collections.sort(sorted);
//         for(Character x : sorted){
//             System.out.println(x +" : " + count.get(x));
//         }
//     }
// }
import java.util.*;

public class CountLetters {
    // https://codeforces.com/group/MWSDmqGsZm/contest/219856/problem/J
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] count = new int[26]; 

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) ('a' + i) + " : " + count[i]);
            }
        }
    }
}

