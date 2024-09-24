public class TestScores {

    private double test1;
    private double test2;
    private double test3;
    private double average;

    public double getTest1() {
        return test1;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }

    public double getTest2() {
        return test2;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }

    public double getTest3() {
        return test3;
    }

    public void setTest3(double test3) {
        this.test3 = test3;
    }

    public double getAverage() {
        return (test1 + test2 + test3) / 3;
    }

    public char getLetterGrade() {
        if ( {
            System.out.println("You get an A");
        } else if (score.getAverage() >= 80) {
            System.out.println("You get a B");
        } else if (score.getAverage() >= 70) {
            System.out.println("You get a C");
        } else if (score.getAverage() >= 60) {
            System.out.println("You get a D");
        } else {
            System.out.println("You get an F");
        }
    }
}