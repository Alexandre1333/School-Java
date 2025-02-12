import java.util.ArrayList;
import java.util.Scanner;
public class GeometricShapeDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ArrayList for Circle object to store info
        ArrayList<Circle> circles = new ArrayList<>();
        // ArrayList for Rectangle object to store info
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        // initialize userChoice int for use in selecting menu option
        int userChoice;
        // Try catch method to make sure application does not terminate without some type of error handling message
        try {
            // Loops so that user can make as many objects as they want without the app immediately terminating
            do {
                // Menu options
                System.out.println("1: Create a circle");
                System.out.println("2: Create a rectangle");
                System.out.println("3: Display all objects");
                System.out.println("4: Exit");
                userChoice = scn.nextInt();
                switch (userChoice) {
                    // Each case represents the proper menu option and its function
                    case 1 -> {
                        // Creating a new circle
                        System.out.println("Enter outline colour: ");
                        String colour = scn.next();
                        System.out.println("Enter radius: ");
                        double radius = scn.nextDouble();
                        // adds the values entered by user into a new Circle array
                        circles.add(new Circle(colour, radius));
                    }
                    case 2 -> {
                        // Creating a new rectangle
                        System.out.println("Enter outline colour: ");
                        String colour = scn.next();
                        System.out.println("Enter height: ");
                        double height = scn.nextDouble();
                        System.out.println("Enter width: ");
                        double width = scn.nextDouble();
                        // adds the values entered by user into a new Rectangle array
                        rectangles.add(new Rectangle(colour, height, width));
                    }
                    case 3 -> {
                        System.out.println("Circles: ");
                        // for-each loop, prints each object in Circle array
                        for (Circle c : circles) System.out.println(c);
                        System.out.println("Rectangles: ");
                        for (Rectangle r : rectangles) System.out.println(r); // for-each loop, prints each object in Rectangle array

                    }
                    case 4 -> {
                        System.out.println("Exiting...");
                    }
                    // Will show menu option again if user types incorrect menu option
                    default -> {
                        System.out.println("Invalid choice. Please choose again.");
                    }

                }
                // checks when 4 is entered as choice, if so, exit program
            } while (userChoice != 4);
            // error checking for when user enters a non-numerical value or incorrect string
        } catch (Exception e) {
            System.out.println("Please enter a correct numerical value or string");
        }
    }
}
