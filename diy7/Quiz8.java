package diy7;
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
