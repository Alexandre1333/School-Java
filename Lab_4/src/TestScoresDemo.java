import java.util.Scanner;
public class TestScoresDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        TestScores score = new TestScores();

        System.out.println("Enter score #1 ");
        score.setTest1(scn.nextDouble());

        System.out.println("Enter score #2 ");
        score.setTest2(scn.nextDouble());


        System.out.println("Enter score #3 ");
        score.setTest3(scn.nextDouble());

        TestScores average = new TestScores();

        System.out.println("The average of these three scores is " + score.getAverage() );

        if(score.getAverage() >=90){
            System.out.println("You get an A");
        }
        else if(score.getAverage() >=80){
            System.out.println("You get a B");
        }
        else if(score.getAverage() >=70){
            System.out.println("You get a C");
        }
        else if(score.getAverage() >=60){
            System.out.println("You get a D");
        }
        else {
            System.out.println("You get an F");
        }
    }
}