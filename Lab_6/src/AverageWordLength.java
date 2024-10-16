import java.util.Scanner;

public class AverageWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLength = 0;
        int wordCount = 0;

        while (true) {
            System.out.print("Enter a word (or press Enter to finish): ");
            String word = scanner.nextLine();

            if (word.equals("")) {
                break;
            }

            totalLength += word.length();
            wordCount++;
        }


        if (wordCount > 0) {
            double averageLength = (double) totalLength / wordCount;
            int roundedAverageLength = (int) Math.round(averageLength);

            System.out.println("\nIterations run: " + wordCount);
            System.out.println("Total word length: " + totalLength);
            System.out.println("Average length of entered words: " + averageLength);
            System.out.println("Rounded average length: " + roundedAverageLength);
        } else {
            System.out.println("No words were entered.");
        }

        scanner.close();
    }
}
