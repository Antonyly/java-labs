package ExamWork.First;

public class Car {
    private Body body;
    private Engine engine;
    private Suspension suspension;
    private Electronics electronics;

    public Car(Body body, Engine engine, Suspension suspension, Electronics electronics) {
        this.body = body;
        this.engine = engine;
        this.suspension = suspension;
        this.electronics = electronics;
    }

    public String getCarInfo() {
        return "Car with " +
                body.getBodyInfo() + ", " +
                engine.getEngineInfo() + ", " +
                suspension.getSuspensionInfo() + ", and " +
                electronics.getElectronicsInfo();
    }
}

