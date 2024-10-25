# Question 1
You are given the array with size of n x m. Write the program to calculate the summation of each column in a 2D array.

# Input:
* The first line contains two integers n and m, representing the number of rows and columns of the array.
* The next n lines each contain m integers, representing the elements of the array.

## Output:
* A single line containing m integers, where each integer represents the sum of the corresponding column.

## code

```bash
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
        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
```

## Explain
```bash
 Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
```
กําหนดค่าตัวเเปร
> rows คือ ค่าจํานวนเเถว, column คือ ค่าของเเถวคอลลัม เเละมีตัวเเปรอาเรย์ที่ชื่อ arr

ลูปเเรก
>
