public class Score {
    public static void main(String[] args) {
        double score1 = 92;
        double score2 = 69;
        double score3 = 79;
        double avg = 0;

        avg = (score1 + score2 + score3) / 3;

        if(avg >= 80) {
            System.out.println("W");
        }
        else {
            System.out.println("L");
        }
    }
}