package oopClass3;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private String subject;
    private List<Double> grades = new ArrayList<>();

    public Grades(String subject, Double[] grades) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrades(Double grade){
        grades.add(grade);
    }

    @Override
    public String toString() {

        return "subject= " + subject +
                ", GRADES=" + grades +
                '}';
    }
}

