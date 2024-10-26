package diy7;
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

       int result = ((Primary - secondPrimary) < 0)? (Primary - secondPrimary) * (-1): (Primary - secondPrimary);
       System.out.println(result);

       sc.close();
    }
}
