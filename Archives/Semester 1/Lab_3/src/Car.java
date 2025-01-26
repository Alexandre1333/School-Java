public class Car {
    private String make;
    private int yearModel;
    private int speed;

    public Car(String m, int ym, int s) {
        make = m;
        yearModel = ym;
        speed = s;
        s = 0;
    }
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }
    public void accelerate() {
        speed += 5;
    }
    public void brake() {
        speed -= 5;
    }
}
