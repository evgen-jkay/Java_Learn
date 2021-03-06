package com.myApp.salary;

public class SalaryMonth implements Salary {
    private final double priceHours;
    private final double priceTon;
    private final double prepayment;

    private final double[] workingHours = {6, 7, 4, 9, 3};
    private final double[] manufacturedTons = {20.2, 18.5, 21.8, 12.8, 23.4, 23.4, 20.4, 29.1, 16.2};

    private double allWorkingHours;
    private double allManufacturedTons;

    public SalaryMonth() {
        this.priceHours = 62.5;
        this.priceTon = 75;
        this.prepayment = 2455;
    }

    protected double getPriceHours() {
        return priceHours;
    }

    protected double getPriceTon() {
        return priceTon;
    }

    protected double getPrepayment() {
        return prepayment;
    }

    protected double getAllWorkingHours() {
        for (double workingHour : workingHours) {
            allWorkingHours += workingHour;
        }
        return allWorkingHours;
    }

    protected double salaryForHours() {
        return allWorkingHours * getPriceHours();
    }

    protected double getAllManufacturedTons() {
        for (double manufacturedTon : manufacturedTons) {
            allManufacturedTons += manufacturedTon;
        }
        return allManufacturedTons;
    }

    protected double salaryForTon() {
        return allManufacturedTons * getPriceTon();
    }

    protected double allSalary() {
        return salaryForHours() + salaryForTon();
    }

    @Override
    public void salaryInfo() {
        System.out.println("Всего отработанно часов: " + getAllWorkingHours() + "ч.");
        System.out.println("Заработано за робочие часы: " + salaryForHours() + " грн.");
        System.out.println("-----");
        System.out.println("Всего сделано тонн: " + getAllManufacturedTons() + "т.");
        System.out.println("Заработано за тоннаж: " + salaryForTon() + " грн.");
        System.out.println("----------");
        System.out.println("Аванс: " + getPrepayment() + " грн.");
        System.out.println("Зарплата: " + allSalary() + " грн.");
        System.out.println("Зарплата с вычетом аванса: " + (allSalary() - getPrepayment()) + " грн.");
    }

    public static void main(String[] args) {
        SalaryMonth salaryMonth = new SalaryMonth();
        salaryMonth.salaryInfo();
    }

}
