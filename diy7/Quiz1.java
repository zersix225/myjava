package diy7;
import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
            sum = 0;
        }
        sc.close();
    }
}
