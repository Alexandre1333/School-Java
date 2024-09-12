import java.util.Scanner;
public class TestScoresDemo {

    public static void main(String[] args) {

        TestScores test1 = new TestScores();
        Scanner t1 = new Scanner(System.in);
        System.out.println("Enter score #1 ");
        test1.setTest1(t1.nextDouble());

        TestScores test2 = new TestScores();
        Scanner t2 = new Scanner(System.in);
        System.out.println("Enter score #2 ");
        test2.setTest2(t2.nextDouble());

        TestScores test3 = new TestScores();
        Scanner t3 = new Scanner(System.in);
        System.out.println("Enter score #3 ");
        test3.setTest3(t3.nextDouble());

        TestScores average = new TestScores();

        System.out.println("The average of these three scores is " + average.getAverage() );

    }
}
