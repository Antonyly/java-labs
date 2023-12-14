package ExamWork.Second;

import java.util.List;

public class AdmissionResult {
    public static void main(String[] args) {

        Subject math = new Subject("Math", 95);
        Subject physics = new Subject("Physics", 90);
        Subject chemistry = new Subject("Chemistry", 88);

        List<Subject> subjects1 = List.of(math, physics, chemistry);
        Abiturient abiturient1 = new Abiturient("John Doe", "Engineering", subjects1);


        Faculty engineeringFaculty = new Faculty("Engineering", 2);
        Faculty medicineFaculty = new Faculty("Medicine", 3);


        engineeringFaculty.admitAbiturient(abiturient1);


        System.out.println("Зараховані на факультет " + engineeringFaculty.getName() + ":");
        for (Abiturient admittedAbiturient : engineeringFaculty.getAdmittedAbiturients()) {
            System.out.println(admittedAbiturient.getName());
        }
    }
}

