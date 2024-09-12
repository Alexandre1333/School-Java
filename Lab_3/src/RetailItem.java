public class RetailItem {

    private String description;
    private int unitsOnHand;
    private double price;

    public void setDescription(String d) {
        description = d;
    }
    public void setUnitsOnHand(int u) {
        unitsOnHand = u;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getDescription() {
        return description;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    public double getPrice() {
        return price;
    }
}

