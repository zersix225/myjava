package javaoop;
import java.util.*;
public class LocationDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        Location l1 = new Location();
        double[][] array = new double[rows][column];
        
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextDouble();
            }
        }

        l1.findMax(array);
        l1.showDisplay();
        sc.close();
    }
}
