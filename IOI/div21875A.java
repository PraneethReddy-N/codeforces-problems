import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class div21875A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // Number of test cases

        for (int i = 0; i < t; i++) {
            String[] abn = br.readLine().split(" ");
            int a = Integer.parseInt(abn[0]); // maximum value of the bomb's timer
            int b = Integer.parseInt(abn[1]); // initial value of the timer of the bomb
            int n = Integer.parseInt(abn[2]); // number of tools

            int[] tools = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            List<int[]> effectiveIncreases = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                effectiveIncreases.add(new int[]{Math.min(tools[j], a - b) - 1, j});
            }

            effectiveIncreases.sort((o1, o2) -> Integer.compare(o2[0], o1[0])); // Sort in descending order

            long timeUntilExplosion = b; // Initialize the time_until_explosion with the initial timer value
            for (int[] increaseIndexPair : effectiveIncreases) {
                int increase = increaseIndexPair[0];
                int index = increaseIndexPair[1];

                if (increase < 0) // If using the tool doesn’t provide any benefit, break from the loop
                    break;

                timeUntilExplosion += increase + 1; // Update the time_until_explosion value
                b = Math.min(b + tools[index], a) - 1; // Update the current timer value after using the tool
            }

            System.out.println(timeUntilExplosion);
        }
    }
}
