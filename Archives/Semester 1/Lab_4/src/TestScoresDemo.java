import java.util.Scanner;
public class TestScoresDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        TestScores score = new TestScores(0,0,0);

        System.out.println("Enter score #1 ");
        score.setTest1(scn.nextDouble());

        System.out.println("Enter score #2 ");
        score.setTest2(scn.nextDouble());


        System.out.println("Enter score #3 ");
        score.setTest3(scn.nextDouble());


        System.out.println("The average of these three scores is " + score.getAverage() );

        System.out.println("You get a " + score.getLetterGrade());
    }
}
