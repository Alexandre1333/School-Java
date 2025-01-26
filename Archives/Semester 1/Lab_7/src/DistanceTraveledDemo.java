import java.util.Scanner;
public class DistanceTraveledDemo {
    public static void main(String[] args) {
        DistanceTraveled dt = new DistanceTraveled(0,0);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        dt.setSpeed(scn.nextInt());

        System.out.println("Enter amount of hours: ");
        dt.setHours(scn.nextInt());

        for (int i = 1; i <= dt.getHours(); i++) {
            System.out.println(i + "\t\t" + dt.getDistance(i) + " miles ");
        }
    }
}
