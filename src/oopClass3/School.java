package oopClass3;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private final List<Student>STUDENTS_LIST = new ArrayList<>();
    private final List<Teacher>TEACHERS_LIST = new ArrayList<>();
    private final List<Employee>EMPLOYEES_LIST = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }
    public void addEmployee(String name, String cpf, String rg, double salary, String role){
        boolean employeeExist = false;
        for(Employee employeeTemp : EMPLOYEES_LIST){
            if ( employeeTemp.getCpf().equalsIgnoreCase(cpf)){
                employeeExist = true;
                break;
            }
        }
        if(!employeeExist){
            Employee employee = new Employee(name, cpf, rg, salary, role);
            EMPLOYEES_LIST.add(employee);
        }
    }
    public void addTeacher(String name, String cpf, String rg, double salary, ArrayList<String>classes, ArrayList<String>subjects){
        boolean teacherExist = false;
        for(Teacher teacherTemp : TEACHERS_LIST){
            if ( teacherTemp.getCpf().equalsIgnoreCase(cpf)){
                teacherExist = true;
                break;
            }
        }
        if(!teacherExist){
            Teacher teacher = new Teacher(name, cpf, rg, salary,classes,subjects);
            TEACHERS_LIST.add(teacher);
        }
    }
    public void addStudent(String name, String cpf, String rg, int age, String className, ArrayList<Grades> grades){
        boolean studentExist = false;
        for(Student studentTemp : STUDENTS_LIST){
            if ( studentTemp.getCpf().equalsIgnoreCase(cpf)){
                studentExist = true;
                break;
            }
        }
        if(!studentExist){
            Student student = new Student(name, cpf, rg, age, className, grades);
            STUDENTS_LIST.add(student);
        }
    }
    public void updateEmployee(String cpf, Employee employee){
        for(Employee employeeTemp : EMPLOYEES_LIST){
            if ( employeeTemp.getCpf().equalsIgnoreCase(cpf)){
                employeeTemp = employee;
                break;
            }
        }
    }
    public void updateTeacher(String cpf, Teacher teacher){
        for(Teacher teacherTemp : TEACHERS_LIST){
            if ( teacherTemp.getCpf().equalsIgnoreCase(cpf)){
                teacherTemp = teacher;
                break;
            }
        }
    }
    public void updateStudent(String cpf, Student student){
        for(Student studentTemp : STUDENTS_LIST){
            if ( studentTemp.getCpf().equalsIgnoreCase(cpf)){
                studentTemp = student;
                break;
            }
        }
    }
    public void deleteEmployee(String cpf){
        for (Employee emplyee:EMPLOYEES_LIST) {
            if (emplyee.getCpf().equalsIgnoreCase(cpf)){
                EMPLOYEES_LIST.remove(emplyee);
                break;
            }
        }
    }
    public void deleteTeacher(String cpf){
        for (Teacher teacher:TEACHERS_LIST) {
            if (teacher.getCpf().equalsIgnoreCase(cpf)){
                TEACHERS_LIST.remove(teacher);
                break;
            }
        }
    }
    public void deleteStudent(String cpf){
        for (Student student:STUDENTS_LIST) {
            if (student.getCpf().equalsIgnoreCase(cpf)){
                STUDENTS_LIST.remove(student);
                break;
            }
        }
    }
    public void getStudents(){
        for (Student student:STUDENTS_LIST) {
            student.printStudent();
        }
    }
    public void getStudentByCpf(String cpf){
        for (Student student:STUDENTS_LIST) {
            if (student.getCpf().equalsIgnoreCase(cpf)){
                student.printStudent();
                break;
            }
        }
    }
    public void getEmployees(){
        for (Employee employee:EMPLOYEES_LIST) {
            employee.printEmployee();
        }
    }
    public void getEmployeeByCpf(String cpf){
        for (Employee employee:EMPLOYEES_LIST) {
            if (employee.getCpf().equalsIgnoreCase(cpf)){
                employee.printEmployee();
                break;
            }
        }
    }
    public void getSTeachers(){
        for (Teacher teacher:TEACHERS_LIST) {
            teacher.printTeacher();
        }
    }
    public void getTeacherByCpf(String cpf){
        for (Teacher teacher:TEACHERS_LIST) {
            if (teacher.getCpf().equalsIgnoreCase(cpf)){
                teacher.printTeacher();
                break;
            }
        }
    }

    public void getByCpf(String cpf){
        getEmployeeByCpf(cpf);
        getTeacherByCpf(cpf);
        getStudentByCpf(cpf);
    }
    public void getTeacherByName(String name){
        for (Teacher teacher:TEACHERS_LIST) {
            if (teacher.getName().equalsIgnoreCase(name)){
                teacher.printTeacher();
                break;
            }
        }
    }
    public void getEmployeeByName(String name){
        for (Employee employee:EMPLOYEES_LIST) {
            if (employee.getName().equalsIgnoreCase(name)){
                employee.printEmployee();
                break;
            }
        }
    }
    public void getStudentByName(String name){
        for (Student student:STUDENTS_LIST) {
            if (student.getName().equalsIgnoreCase(name)){
                student.printStudent();
                break;
            }
        }
    }
    public void getByName(String name){
        getEmployeeByName(name);
        getTeacherByName(name);
        getStudentByName(name);
    }
}
