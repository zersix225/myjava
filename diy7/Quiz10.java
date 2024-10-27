package diy7;
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

        String result = (maxStreak > 1)? "days":"day";
        System.out.println(maxStreak+" "+result);
        sc.close();

    }
}
