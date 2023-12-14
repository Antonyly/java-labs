package ExamWork.First;

public class CarAssemblyProgram {
    public static void main(String[] args) {
        // Використання IoC для створення автомобіля
        Car car = new Car(new SkodaBody(), new SkodaEngine(), new SkodaSuspension(), new SkodaElectronics());

        // Виведення інформації про автомобіль
        System.out.println(car.getCarInfo());
    }
}

