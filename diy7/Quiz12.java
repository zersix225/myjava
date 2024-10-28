package diy7;
import java.util.Scanner;
public class Quiz12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                int targetRow = rows - 1 - i;
                int targetCol = cols - 1 - j;

                
                if (i < targetRow || (i == targetRow && j < targetCol)) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[targetRow][targetCol];
                    matrix[targetRow][targetCol] = temp;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
