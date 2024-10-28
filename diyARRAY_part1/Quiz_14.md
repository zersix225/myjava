# #Question 14
Write a program to invert the colors of a grayscale image represented by a 2D array, where each pixel value ranges from 0 to 255, write a program to invert the colors of the image. 

## Input:
* The first line contains two integers n and m, representing the number of rows and columns of the grayscale image. 
* The next n lines each contain m integers, representing the pixel values of the image, where each value is in the range [0, 255]. 


## Output:
* There are n lines of output, where each line contains m integers representing the inverted pixel values. 

## Hint:
* Inversion Formula: inverted_value = 255 - original_value
* Math.abs() 

## Code

```bash
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
```