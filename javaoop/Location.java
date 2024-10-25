package javaoop;
public class Location {
    private int column;
    private int row;
    private double maxValue;

    public Location(){
        
    }

    //2 method, find, showDisplay
    public void findMax(double[][] array){
        maxValue = array[0][0];
        row = 0;
        column = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }

    public void showDisplay(){
        System.out.println("The location of the largest element is " + 
        maxValue + " at " + "(" + row + ", " + column + ").");
    }
}
