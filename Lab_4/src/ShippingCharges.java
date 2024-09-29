import java.lang.Math;
public class ShippingCharges {
    private int packageWeight;
    private int milesShipped;

    public ShippingCharges(int pw, int ms) {
        packageWeight = pw;
        milesShipped = ms;
    }

    public void setMilesShipped(int ms) {
        milesShipped = ms;
    }
    public void setPackageWeight(int pw){
        packageWeight = pw;
    }
    public int getMilesShipped(){
        return milesShipped;
    }
    public int getPackageWeight() {
        return packageWeight;
    }
    public double getFees() {
        double chunksD = milesShipped/500;
        double chunks = Math.floor(chunksD);

        double ratePer500Miles = 0.0;
        if (packageWeight > 10){
            ratePer500Miles = 4.80;

        }else if (packageWeight > 6){
                ratePer500Miles = 3.70;

        }else if (packageWeight > 2) {
            ratePer500Miles = 2.20;
        }else{
            ratePer500Miles=1.1;
        }

         return ratePer500Miles * chunks;
    }

}
