# #Question 9
You are given a square matrix of integers. Your task is to calculate the absolute difference between the sums of its primary diagonal (from the top-left to the bottom-right) and its secondary diagonal (from the top-right to the bottom-left).

## Input:
* The first line contains a single integer, 𝑛, the number of rows and columns in the square matrix (the matrix is 𝑛×𝑛). The next 𝑛 lines each contain 𝑛 space-separated integers representing the rows of the matrix.


## Output:
* Return a single integer representing the absolute difference between the sums of the matrix's two diagonals. 

## Explanation:
* The primary diagonal is: 11, 5, -12. Sum across the primary diagonal: 11 + 5 − 12 = 4.
* The secondary diagonal is: 4, 5, 10. Sum across the secondary diagonal: 4 + 5 + 10 = 19.
* Difference: | 4 − 19 | = 15.

## Code

```bash
import java.util.Scanner;
public class Quiz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //primary section
        int Primary = 0;
        for (int i = 0; i < matrix.length; i++) {
            Primary += matrix[i][i];
        }

        //second primary section
        int secondPrimary = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length-1-i;
            secondPrimary += matrix[i][j];
        }

       System.out.println((Primary - secondPrimary) < 0? (Primary - secondPrimary) * (-1): (Primary - secondPrimary));
       sc.close();
    }
}

```