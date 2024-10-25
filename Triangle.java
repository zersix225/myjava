import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }

        //summation upperTriangl
        int index = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = index; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            index++;
        }
        System.out.println(sum);
        
        //summation lowerTriangle
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
