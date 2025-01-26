public class CircleDemo {

    public static int searchCircle(Circle[] arr, double searchRadius) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].radius == searchRadius) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(3.5),
                new Circle(2.0),
                new Circle(3.5),
                new Circle(5.0)
        };

        double searchRadius = 5.0;
        int index = searchCircle(circles, searchRadius);
        System.out.println("Index of Circle with radius " + searchRadius + ": " + index);
    }
}



