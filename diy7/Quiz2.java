package diy7;
import java.util.Scanner;
public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] grid = new int[rows][column];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        boolean  isValid = true;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i + 1 < grid.length && grid[i][j] != grid[i+1][j]) {
                    isValid = false;
                    break;
                }
                if (j + 1 < grid[i].length && grid[i][j] == grid[i][j+1]) {
                    isValid = false;
                    break;
                }
            }
            if (!isValid) {
                break;
            }
        }

        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
