package Problem;

public class Sales {
    public static void main (String[] args) {

        double percentSales;
        double grossSales;
        percentSales = 0.65;
        grossSales = 8300000;

        double total = grossSales * percentSales;

        System.out.println("The company will generate a total of $" + total);
    }

}
