public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Ford", 2023, 20);

        // Accelerating 5 times
        System.out.println("Accelerating:");
        car.accelerate();
        System.out.println("Current speed: " + car.getSpeed());

        car.accelerate();
        System.out.println("Current speed: " + car.getSpeed());

        car.accelerate();
        System.out.println("Current speed: " + car.getSpeed());

        car.accelerate();
        System.out.println("Current speed: " + car.getSpeed());

        car.accelerate();
        System.out.println("Current speed: " + car.getSpeed());

        // Braking 5 times
        System.out.println("\nBraking:");
        car.brake();
        System.out.println("Current speed: " + car.getSpeed());

        car.brake();
        System.out.println("Current speed: " + car.getSpeed());

        car.brake();
        System.out.println("Current speed: " + car.getSpeed());

        car.brake();
        System.out.println("Current speed: " + car.getSpeed());

        car.brake();
        System.out.println("Current speed: " + car.getSpeed());
    }
}
