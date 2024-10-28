package diy7;
import java.util.Scanner;
public class Quiz14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] color = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                color[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int invertNum = 255 - color[i][j];

                if (invertNum < 0) Math.abs(invertNum);
                color[i][j] = invertNum;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(color[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
