package com.example.gestionbancaire1.model;

import java.time.LocalDate;


public class Operation {
    private Integer num;
    private Double montant;
    private LocalDate date;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Operation(Integer num, Double montant, LocalDate date) {
        this.num = num;
        this.montant = montant;
        this.date = date;
    }
}
