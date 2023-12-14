package fifthLab;

public class Bicycle extends AbstractVehicle {
    private int numberOfGears;

    public Bicycle(String model, int year, int numberOfGears) {
        super(model, year);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void start() {
        System.out.println("Pedaling the bicycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bicycle.");
    }
}
