package fifthLab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення колекції об'єктів транспортних засобів
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota Camry", 2022, 4));
        vehicles.add(new Motorcycle("Harley Davidson", 2021, true));
        vehicles.add(new Bicycle("Giant Defy", 2020, 21));

        // Виведення інформації з колекції на екран
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
    }
}

