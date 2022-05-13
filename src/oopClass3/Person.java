package oopClass3;

public class Person {
    String name;
    String cpf;
    public String rg;

    public Person(String name, String cpf, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }

    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " +rg);
    }

}
