# #Question 8
You are given an array of integers, where all elements but one occur twice. Your task is to find the unique element that occurs only once in the array.

## Input:
* The first line contains a single integer, 𝑛, the number of integers in the array. The second line contains 𝑛 space-separated integers that describe the values in the array.


## Output:
* Return a single integer representing the element that occurs only once.

## Explanation:
* In the array, all elements occur twice except for the number 3, which occurs only once.

## Code

```bash
import java.util.Scanner;
public class Quiz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
    
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int num = 0;
        boolean foundUnique;
        for (int i = 0; i < arr.length; i++) {
            foundUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    foundUnique = false;
                    break;
                }
            }
            if (foundUnique) {
                num = arr[i];
                break;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
```