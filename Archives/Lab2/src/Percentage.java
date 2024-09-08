import java.util.Scanner;
public class Percentage {

    public static void main(String[] args) {

        Scanner inputMale = new Scanner(System.in);
        System.out.print("Enter the number of male students: ");
        int males = inputMale.nextInt();

        Scanner inputFemale = new Scanner(System.in);
        System.out.print("Enter the number of female students: ");
        int females = inputFemale.nextInt();

        double totalStudents = males + females;

        double percentMale = males / totalStudents;
        double percentFemale = females / totalStudents;

        System.out.printf("Male: %8.2f%%\n", percentMale * 100);
        System.out.printf("Female: %8.2f%%\n", percentFemale * 100);


    }
}
