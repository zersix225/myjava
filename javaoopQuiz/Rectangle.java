package javaoopQuiz;

public class Rectangle {
    private int height;
    private int width;

    Rectangle (int height, int width){
        this.height = height;
        this.width = width;
    }

    //method get hegth, width
    //get cal areea
    //get perimeter

    public int getHeight(){
        return height;
    }

    public int getWidht(){
        return width;
    }
    
    public int getArea() {
        return height * width; 
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }
}
