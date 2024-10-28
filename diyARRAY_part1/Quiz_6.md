# #Question 6
A museum’s lighting system is organized into floors, rooms, and light zones, represented as a 3D array. Each light can have a status: 1 (On) and 0 (Off). Write a program to turn off all lights on a given floor and count the total number of lights still on across the building.

## Input:
* The first line contains three integers:
    * F: Number of floors
    * R: Number of rooms per floor
    * Z: Number of light zones per room
* The next F * R lines contain Z integers each, representing the light status in each room (1 for On, 0 for Off). 
* The last line contains a single integer, floor_num, representing the floor to turn off (1-based index).

## Output:
* The **updated 3D array**, where all lights on the specified floor are turned off. 
* The **total number of lights** was still on across the entire building.

## Code

```bash
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
```