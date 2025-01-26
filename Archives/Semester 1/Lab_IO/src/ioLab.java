import java.io.*;
import java.util.Scanner;
public class ioLab {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("numbers.txt");
        for (int i = 1; i <= 10; i++) {
            outputFile.println(i);
        }
        outputFile.close();

        File file = new File("numbers.txt");
        Scanner inputFile = new Scanner(file);

        int sum = 0;
        int count = 0;

        while (inputFile.hasNext()) {
            int number = inputFile.nextInt();
            sum += number;
            count++;
        }

        inputFile.close();

        double average = (double) sum / count;
        System.out.println("The average is: " + average);
    }
}
