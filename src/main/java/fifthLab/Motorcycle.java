package fifthLab;

public class Motorcycle extends AbstractVehicle {
    private boolean hasSideCar;

    public Motorcycle(String model, int year, boolean hasSideCar) {
        super(model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle engine.");
    }
}