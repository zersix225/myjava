package diy7;
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
