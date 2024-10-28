# #Question 3
Write a Java program that allows the user to input a number and then searches for that number in a given 2D matrix. The program should return all the indices (row and column) of the number if it appears more than once. If the number does not exist in the matrix, the program should indicate that the number is not present.

## Input:
* First line contains row and column of the matrix and the number for searching
* Second line contains the members of the matrix


## Output:
* Display all the indices of the number in the matrix or a message indicating that the number is not present.

## Code

```bash
import java.util.Scanner;
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

        System.out.print(result);
        for (int i = 0; i < round*2; i+=2) {
            System.out.print(" ("+position[i]+","+position[i+1]+")");
        }
        sc.close();
    }
}
```