package javaoop;
import java.util.*;
public class CircleDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        double radius = sc.nextDouble();
        c.setRadius(radius);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        sc.close();
    }
}

