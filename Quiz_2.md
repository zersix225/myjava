# Question 2
You are given a 2D matrix grid of size m x n. You need to check if each cell grid[i][j] is:
* Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists). 
* Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).

Return true if **all** the cells satisfy these conditions, otherwise, return false.

# Input:
* Row and Col sizes
* Input array

## Output:
* True if conditions are met, false otherwise

## code

```bash
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
```
