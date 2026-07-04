package com.cognizant.loan.model;

public class Loan {

    private String loan_number;
    private String type;
    private double loan;
    private int emi;
    private int tenure;

    public Loan() {
    }

    public Loan(String loan_number, String type, double loan, int emi, int tenure) {
        this.loan_number = loan_number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return loan_number;
    }

    public void setNumber(String loan_number) {
        this.loan_number = loan_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}