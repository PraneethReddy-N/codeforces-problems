import java.util.Scanner;

public class TargetPracC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            char[][] grid = new char[10][10];

            // Read the grid for each test case
            for (int row = 0; row < 10; row++) {
                String rowStr = in.next();
                grid[row] = rowStr.toCharArray();
            }

            int totalPoints = calculateTotalPoints(grid);
            System.out.println(totalPoints);
        }
    }

    // Function to calculate the total number of points of the arrows
    private static int calculateTotalPoints(char[][] grid) {
        int totalPoints = 0;

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (grid[row][col] == 'X') {
                    int distanceToCenter = Math.min(row, Math.min(9 - row, Math.min(col, 9 - col)));
                    totalPoints += 6 - distanceToCenter;
                }
            }
        }

        return totalPoints;
    }
}
