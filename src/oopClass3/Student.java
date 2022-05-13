package oopClass3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int age;
    private String className;
    private List<Grades> gradesList;

    public Student(String name, String cpf, String rg, int age, String className, ArrayList<Grades> grades) {
        super(name, cpf, rg);
        this.age = age;
        this.className = className;
        this.gradesList = grades;
    }

    public double getAverage(){
        double average = 0;
        for (Grades grade:gradesList) {
            double subAverage = 0;
            for(Double subGrade : grade.getGrades()){
                subAverage+= subGrade;
            }
            subAverage/= grade.getGrades().size();
            System.out.printf("%-10s: %.2f",grade.getSubject(),subAverage);
            average += subAverage;
        }
        average/=gradesList.size();
        return average;
    }
    public void printStudent(){
        printPerson();
        System.out.println("Age: " + age);
        System.out.println("Class: " + className);
        System.out.println("Grades: ");
        for(Grades grade:gradesList){
            System.out.println(grade);
        }
    }

}
