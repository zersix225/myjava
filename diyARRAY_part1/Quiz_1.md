# #Question 1
You are given the array with size of n x m. Write the program to calculate the summation of each column in a 2D array.

## Input:
* The first line contains two integers n and m, representing the number of rows and columns of the array.
* The next n lines each contain m integers, representing the elements of the array.

## Output:
* A single line containing m integers, where each integer represents the sum of the corresponding column.

## For Example:

| Input  | Result |
|--------|--------|
| 3 3    |        |
| 1 2 3  | 12     |
| 4 5 6  | 15     |
| 7 8 9  | 18     |

## Code

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
```
**กําหนดตัวเเปร**
> rows คือ จํานวนเเถว, column คือ จํานวนคอลลัมในเเต่ละเเถว เเละมีตัวเเปรอาเรย์ที่ชื่อ arr นําค่าของ rows column มากําหนดเป็นขนาดของอาเรย์

```bash
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
```
**การทํางานของ loop ตัวเเรก**

>เป็นการทํางานเเบบ loop ซ้อน loop หรือที่เรียกกันว่า nested loop จะทํางานจาก outer loop --> inner loop 
- **outer loop:** ทําจนกว่า i < ขนาดของอารย์
- **inner loop:** จะรับค่ามาเก็บในอารย์ ใน index ที่ i กับ j เเละทําจนกว่า j < ขนาดของ rows

```bash
        int sum = 0;
        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
            sum = 0;
        }
```
**การทํางานของ loop ตัวที่สอง**
>สร้างตัวเเปรที่ชื่อ sum เพื่อมาเก็บค่ารวมของตัวเลข
- **outer loop:** ทําจนกว่า i < จํานวนสมาชิกในคอลัม เพื่อให้สามารถรันครบเท่ากับค่าในคอลัมได้
- **inner loop:** ทําจนกว่า j < ขนาดของอาเรย์ เเล้วบวกค่าตัวเลขมาเก็บไว้ในตัวเเปรที่ชื่อว่า sum เเละกําหนดตําเเหน่งของอาเรย์เป็น rows = j column = i เพราะเราจะให้ j+1 ไปเรื่อยในเเต่ละรอบ 

**สมมุติ รอบที่ 1:**
- i = 0, j = 0
- i = 0, j = 1
- i = 0, j = 2


