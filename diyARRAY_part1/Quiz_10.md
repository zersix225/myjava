# #Question 10
Write a program to determine the longest streak of consecutive days where the user walked more than 10,000 steps.

## Input:
* The first line contains an integer n, representing the number of days tracked.
* The second line contains n integers, where each integer indicates the step count for a specific day.

## Output:
* A single integer represents the longest streak of consecutive days with more than 10,000 steps.

## Code

```bash
import java.util.Scanner;
public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int streak = 0, maxStreak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10000) {
                streak++;
                if (streak > maxStreak) maxStreak = streak;
            }else{
                streak = 0;
            }
        }

        System.out.println(maxStreak+" "+(maxStreak > 1? "days":"day"));
        sc.close();

    }
}
```