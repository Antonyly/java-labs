package fifthLab;
// Інтерфейс, що описує транспортний засіб

// Абстрактний клас, який реалізує інтерфейс та надає базовий функціонал
public abstract class AbstractVehicle implements Vehicle {
    private String model;
    private int year;

    public AbstractVehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Геттери та сеттери

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
