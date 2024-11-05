import java.util.Scanner;
public class Area {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double width, double length) {
        return width * length;
    }

    public static double calculateArea(boolean flag,double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static void main(String[] args) {
        double circleArea = Area.calculateArea(5);
        System.out.println("Area of the circle with radius 5: " + circleArea);

        double rectangleArea = Area.calculateArea(4, 6);
        System.out.println("Area of the rectangle with width 4 and length 6: " + rectangleArea);

        double cylinderArea = Area.calculateArea(3, 7);
        System.out.println("Surface area of the cylinder with radius 3 and height 7: " + cylinderArea);
    }
}



