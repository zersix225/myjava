package javaoopQuiz;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10, 5);

        System.out.println("Height: "+R1.getHeight());
        System.out.println("Width: "+R1.getWidht());
        System.err.println("Area: "+R1.getArea());
        System.out.println("Perimeter: "+R1.getPerimeter());
    }
}
