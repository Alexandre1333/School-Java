public class SoftwareSales {
    private int unitsSold;
    private final double UNIT_PRICE = 99.0;

    public SoftwareSales(int u) {
        unitsSold = u;
    }

    public void setUnitsSold(int u) {
        unitsSold = u;
    }
    public int getUnitsSold() {
        return unitsSold;
    }
    public double getDiscount() {
        double discountRate;
        if (unitsSold >= 100) {
            discountRate = 0.5;
        } else if (unitsSold >= 50) {
            discountRate= 0.4;
        } else if (unitsSold >= 20) {
            discountRate = 0.3;
        } else if (unitsSold >= 10) {
            discountRate = 0.2;
        } else {
            discountRate = 0.0;
        }
     return (unitsSold * UNIT_PRICE) * discountRate;
    }
    public double getCost() {
        return (unitsSold * UNIT_PRICE) - getDiscount();
    }
}

