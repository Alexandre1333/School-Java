import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.next().toLowerCase();
        char letter = input.charAt(0);

        if (Character.isLetter(letter)) {

            if ("aeiou".indexOf(letter) != -1) {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(input + " is an invalid input");
        }

        scanner.close();
    }
}

