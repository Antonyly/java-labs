package ExamWork.Second;

import java.util.List;

public class Abiturient {
    private String name;
    private String faculty;
    private List<Subject> subjects;

    public Abiturient(String name, String faculty, List<Subject> subjects) {
        this.name = name;
        this.faculty = faculty;
        this.subjects = subjects;
    }


    public int calculateTotalScore() {
        int totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        return totalScore;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getFaculty() {
        return faculty;
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public List<Subject> getSubjects() {
        return subjects;
    }


    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

