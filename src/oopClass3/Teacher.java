package oopClass3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee{
    private List<String> classesList = new ArrayList<>();
    private List<String> subjectsList = new ArrayList<>();

    public Teacher(String name, String cpf, String rg, double salary, ArrayList<String> classes, ArrayList<String> subjects) {
        super(name, cpf, rg, salary, "Teacher");
        classesList = classes;
        subjectsList = subjects;

    }

    public void printTeacher(){
        printEmployee();
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
        System.out.println("Classes: ");
        for(String className:classesList){
            System.out.println(className);
        }
        System.out.println("Subjects: ");
        for(String subject:subjectsList){
            System.out.println(subject);
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Name: " + name + '\'' +
                ", cpf: " + cpf + '\'' +
                ", rg: " + rg + '\'' +
                ", role: " + role + '\'' +
                ", salary: $" + String.format("%.2f",salary) +
                ", classes: " + classesList +
                ", subjects: " + subjectsList +
                '}';
    }
}
