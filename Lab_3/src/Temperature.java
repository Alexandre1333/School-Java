public class Temperature {
    private double ftemp;

    public void setFarenheit(double ftemp) {
        this.ftemp = ftemp;
    }
    public double getFarenheit() {
        return ftemp;
    }
    public double getCelsius() {
        return (5.0/9.0) * (ftemp - 32);
    }
    public double getKelvin() {
        return ((5.0/9.0) * (ftemp - 32)) + 273;
    }
}
