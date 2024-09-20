import java.util.Scanner;
public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.println("Enter the temperature in Fahrenheit: ");
        temp.setFarenheit(scn.nextDouble());

        System.out.println(temp.getFarenheit() + " Fahrenheit in Celsius is: " + temp.getCelsius() + "\n" + temp.getFarenheit() +  " Fahrenheit in Kelvin is: " + temp.getKelvin());

    }
}
