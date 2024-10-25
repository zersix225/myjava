package diy7;
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
