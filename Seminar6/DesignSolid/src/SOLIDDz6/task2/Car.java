package SOLIDDz6.task2;


public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

