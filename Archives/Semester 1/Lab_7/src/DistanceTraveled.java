public class DistanceTraveled {
    private int hours;
    private int speed;
    public DistanceTraveled(int hours, int speed) {
        this.hours = hours;
        this.speed = speed;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public int getHours() {
        return hours;
    }
    public double getDistance(int hours){
        return speed * hours;
    }
}
