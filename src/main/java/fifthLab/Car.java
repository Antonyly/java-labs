package fifthLab;

// Клас Car, який реалізує транспортний засіб Car
public class Car extends AbstractVehicle {
    private int numberOfDoors;

    public Car(String model, int year, int numberOfDoors) {
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Starting the car engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car engine.");
    }
}