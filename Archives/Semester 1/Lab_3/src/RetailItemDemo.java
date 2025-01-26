public class RetailItemDemo {
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem();

        item1.setDescription("Jacket");
        item1.setPrice(59.95);
        item1.setUnitsOnHand(40);

        RetailItem item2 = new RetailItem();

        item2.setDescription("Designer Jeans");
        item2.setPrice(34.95);
        item2.setUnitsOnHand(12);

        System.out.println("Item #1: " + item1.getDescription() + " Units: " + item1.getUnitsOnHand() + " Price: " +
                item1.getPrice() + "\nItem #2: " + item2.getDescription() + " Units: " + item2.getUnitsOnHand() +
                " Price: " + item2.getPrice());
    }
}
