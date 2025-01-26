import java.util.Scanner;
public class SoftwareSalesDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SoftwareSales sale = new SoftwareSales(0);

        System.out.println("Enter the units sold: ");
        int unitsSold = scn.nextInt();
        sale.setUnitsSold(unitsSold);

        System.out.println("Units sold: " + sale.getUnitsSold());
        System.out.println("Discount: $" + sale.getDiscount());
        System.out.println("Cost: $" + sale.getCost());
    }
}