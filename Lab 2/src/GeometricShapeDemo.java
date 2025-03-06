import java.util.ArrayList;
import java.util.Scanner;
public class GeometricShapeDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ArrayList for All Geometric Shapes
        ArrayList<GeometricShape> shape = new ArrayList<>();
        // initialize userChoice int for use in selecting menu option
        int userChoice;
        // Try catch method to make sure application does not terminate without some type of error handling message
        try {
            // Loops so that user can make as many objects as they want without the app immediately terminating
            do {
                // Menu options
                System.out.println("1: Create a circle");
                System.out.println("2: Create a rectangle");
                System.out.println("3: Create a square");
                System.out.println("4: Compare two objects");
                System.out.println("5: Display all objects");
                System.out.println("6: Display all objects and corresponding areas");
                System.out.println("7: Exit");
                userChoice = scn.nextInt();
                switch (userChoice) {
                    // Each case represents the proper menu option and its function
                    case 1 -> {
                        // Creating a new circle
                        System.out.println("Enter outline colour: ");
                        String colour = scn.next();
                        System.out.println("Enter radius: ");
                        double radius = scn.nextDouble();
                        // Adds the values entered by user to create a new circle in the array
                        shape.add(new Circle(colour, radius));
                    }
                    case 2 -> {
                        // Creating a new rectangle
                        System.out.println("Enter outline colour: ");
                        String colour = scn.next();
                        System.out.println("Enter height: ");
                        double height = scn.nextDouble();
                        System.out.println("Enter width: ");
                        double width = scn.nextDouble();
                        // Makes sure user does not add same width and height for rectangle as it is not a square.
                        if (width == height) {
                            System.out.println("Width and height cannot be the same values for a rectangle");
                        }
                      else {
                            shape.add(new Rectangle(colour, height, width));
                        }
                      }
                    case 3 -> {
                        // Creating a new square
                        System.out.println("Enter outline colour: ");
                        String colour = scn.next();
                        System.out.println("Enter height or width:");
                        double widthOrHeight = scn.nextDouble();
                        shape.add(new Square(colour, widthOrHeight, widthOrHeight));
                    }
                    case 4 ->  {
                        // If there is not enough objects to compare, bring user back to menu
                        if (shape.size() < 2) {
                            System.out.println("Not enough objects to compare.");
                            break;
                        }
                            // Prompts user to enter 2 indexes to compare, shown in case 5
                            System.out.println("Enter first object index #: ");
                            int first = scn.nextInt();
                            System.out.println("Enter second object index #: ");
                            int second = scn.nextInt();
                            // Error checking, make sure user does not select index that is out of bounds
                            if (first >= 0 && first < shape.size() && second >= 0 && second < shape.size()) {
                                System.out.println(shape.get(first).equals(shape.get(second)) ? "Objects are equal." : "Objects are different.");
                            } else {
                                System.out.println("Invalid index.");
                            }
                        }
                    case 5 -> {
                        // Lists out all objects created, prints index number. Useful for comparison part.
                        System.out.println("All Shapes: ");
                        for (int i = 0; i < shape.size(); i++) {
                            System.out.println("Index " + i + ": " + shape.get(i));
                        }
                    }
                    case 6 -> {
                        // Prints out all objects and their area
                        for (GeometricShape shapes : shape) {
                            System.out.println(shapes + ", Area: " + shapes.calcArea());
                        }
                    }
                    case 7 -> {}
                    case 8 -> {}
                    case 9 -> {}
                    case 10 -> System.out.println("Exiting...");
                    // Will show menu option again if user types incorrect menu option
                    default -> System.out.println("Invalid choice. Please choose again.");
                }
                // checks when 7 is entered as choice, if so, exit program
            } while (userChoice != 10);
            // error checking for when user enters a non-numerical value or incorrect string
        } catch (Exception e) {
            System.out.println("Please enter a correct numerical value or string");
        }
    }
}
