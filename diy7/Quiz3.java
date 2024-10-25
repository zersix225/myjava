package diy7;
import java.util.Scanner;;
public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int findNumber = sc.nextInt();

        int[][] arr = new int[rows][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == findNumber) {
                    isFind = true;
                }
            }
        }

        String result = (isFind) 
            ? "Indices of number "+findNumber+":"
            : "There is no number "+findNumber+" in the matrix.";
        
        if (!isFind) {
            System.out.println(result);
            return;
        }
    
        int index = 0;
        int round = 0;
        int[] position = new int [rows*column*2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == findNumber) {
                    position[index] = i;
                    position[index+1] = j;
                    index += 2;
                    round++;
                }
            }
        }

        System.out.println(result);
        for (int i = 0; i < round*2; i+=2) {
            System.out.print(" ("+position[i]+","+position[i+1]+")");
        }

        sc.close();
    }
}
