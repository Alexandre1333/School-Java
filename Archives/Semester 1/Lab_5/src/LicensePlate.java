import java.util.Random;

public class LicensePlate {
    public static void main(String[] args) {
        String platePrefix = "ABC-";
        String plateNumber = platePrefix + generateRandomDigits();

        System.out.println("Generated Vehicle Plate Number: " + plateNumber);
    }

    private static String generateRandomDigits() {
        Random random = new Random();
        String digits = ""
                + random.nextInt(10)
                + random.nextInt(10)
                + random.nextInt(10)
                + random.nextInt(10);

        return digits;
    }
}
