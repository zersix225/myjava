# #Question 4
You are given an array of five positive integers. Your task is to compute the minimum and maximum values that can be obtained by summing exactly four of these five integers. You need to print the minimum and maximum sums as space-separated integers on a single line. 

## Input:
* A single line containing five space-separated positive integers.


## Output Format:
* Print two space-separated long integers representing the minimum sum and the maximum sum that can be calculated by summing exactly four of the five integers.

## Constraints:
* Each integer in the array will be a positive integer, and the maximum number of integers is fixed at five.

## Explanation:
* The minimum sum is obtained by summing the smallest four integers: 1 + 2 + 3 + 4 = 10.
* The maximum sum is obtained by summing the largest four integers: 2 + 3 + 4 + 5 = 14.

## Code

```bash
import java.util.Scanner;
public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        int maxPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        int minValue = arr[0];
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        
        int sum = 0;
        int temp = arr[maxPosition];
        arr[maxPosition] = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum+" ");
        arr[maxPosition] = temp;

        sum = 0;
        arr[minPosition] = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
```