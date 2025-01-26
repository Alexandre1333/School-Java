import java.util.Scanner;
public class ShippingChargesDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ShippingCharges sc = new ShippingCharges(0,0);

        System.out.println("Enter the weight, in kilograms: ");
        sc.setPackageWeight(scn.nextInt());

        System.out.println("Enter The distance to ship, in miles: ");
        sc.setMilesShipped(scn.nextInt());

        System.out.println("The shipping charges are $" + sc.getFees());
    }
}
