package oopClass3;

public class Employee extends Person {
    double salary;
    String role;

    public Employee(String name, String cpf, String rg, double salary, String role) {
        super(name, cpf, rg);
        this.salary = salary;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public void printEmployee(){
        printPerson();
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name: " + name + '\'' +
                ", cpf: " + cpf + '\'' +
                ", rg: " + rg + '\'' +
                ", salary: $" + String.format("%.2f",salary) +
                ", role: " + role + '\'' +
                '}';
    }
}
