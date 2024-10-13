import java.util.Scanner;
public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("String1 and string2 have the same contents");
        } else {
            System.out.println("String1 and string2 don't have the same contents");
        }

    }
}