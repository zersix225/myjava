# #Question 7
Write a Java program that takes n integers, stores them in an array, and shifts all elements left by one position (the first element moves to the last). 

## Input:
* The first line contains an integer n representing the size of the array.
* The second line contains n integers, the elements of the array. 


## Output:
* A single line with the array after shifting all elements left by one position.

## Code

```bash
import java.util.Scanner;
public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
    
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length) {
                arr[i] = arr[i+1];
            }
        }
        arr[arr.length-1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
```