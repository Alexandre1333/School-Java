package Problem;
import java.util.Scanner;

public class Average {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Test Score: ");
        double firstTestScore = input.nextDouble();

        System.out.print("Enter Your Second Test Score: ");
        double secondTestScore = input.nextDouble();

        System.out.print("Enter Your Third Test Score: ");
        double thirdTestScore = input.nextDouble();

        double average = (firstTestScore + secondTestScore + thirdTestScore) / 3;
        System.out.println("Your First Test Score " + firstTestScore + "\nYour Second Test Score " + secondTestScore
                + "\nYour Third Test Score " + thirdTestScore + "\nYour Average Score " + average);
    }

}
