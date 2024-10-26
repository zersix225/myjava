package diy7;
import java.util.Scanner;
public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        int room = sc.nextInt();
        int lightZone = sc.nextInt();
        int[][] lightSystem = new int[floor*room][lightZone];       

        
        for (int i = 0; i < lightSystem.length; i++) {
            for (int j = 0; j < lightSystem[i].length; j++) {
                lightSystem[i][j] = sc.nextInt();
            }
        }
        
        int floorOff = sc.nextInt()-1;
        
        for (int i = floorOff*room; i < (floorOff+1)*room; i++) {
            for (int j = 0; j < lightZone; j++) {
                lightSystem[i][j] = 0;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < lightSystem.length; i++) {
            for (int j = 0; j < lightSystem[i].length; j++) {
                if (lightSystem[i][j] == 1) {
                    sum += lightSystem[i][j];
                }
                System.out.print(lightSystem[i][j]+" "); 
            }
            System.out.println();
            if ((i + 1) % room == 0) {
                System.out.println(); 
            }
            
        }
        System.out.println("Total Lights On: "+sum);
        sc.close();
    }   
}
