package oop2Class3.model;

import java.time.LocalDate;
import java.time.Period;

public class Custumer {
    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDate;

    public Custumer(String name, String rg, String cpf, LocalDate birthDate) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getRg() {
        return rg;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }

    private String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public boolean isOfAge(){
        final Period periodo = Period.between(getBirthDate(), LocalDate.now());
        if (getCpf()!=null && getRg() != null && periodo.getYears()>=18){
            return true;
        }else{
            return false;
        }
    }
}
