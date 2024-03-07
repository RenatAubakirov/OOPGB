package SOLIDDz6.task2;


public abstract class Vehicle {
    private int maxSpeed;
    private String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateAllowedSpeed();
}
