package ExamWork.Second;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private int maxCapacity;
    private List<Abiturient> admittedAbiturients;

    public Faculty(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.admittedAbiturients = new ArrayList<>();
    }


    public void admitAbiturient(Abiturient abiturient) {
        if (admittedAbiturients.size() < maxCapacity) {
            admittedAbiturients.add(abiturient);
        } else {
            System.out.println("Факультет " + name + " вже заповнений.");
        }
    }


    public List<Abiturient> getAdmittedAbiturients() {
        return admittedAbiturients;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }


    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}

