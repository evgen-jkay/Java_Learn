package com.myApp.salary;

public class SalaryDay implements Salary {

    private final double priceHours;
    private final double priceTon;
    private final double workingHours;
    private final double manufacturedTons;

    /**
     * @param workingHours     - рабочие часы
     * @param manufacturedTons - изготовленно тоннажа
     */
    public SalaryDay(double workingHours, double manufacturedTons) {
        this.priceHours = 62.5;
        this.priceTon = 75;
        this.workingHours = workingHours;
        this.manufacturedTons = manufacturedTons;
    }

    public SalaryDay() {
        this.priceHours = 62.5;
        this.priceTon = 75;
        this.workingHours = 0;
        this.manufacturedTons = 0;
    }

    protected double getPriceHours() {
        return priceHours;
    }

    protected double getPriceTon() {
        return priceTon;
    }

    protected double getWorkingHours() {
        return workingHours;
    }

    protected double getManufacturedTons() {
        return manufacturedTons;
    }

    protected double salaryForHours() {
        return getWorkingHours() * getPriceHours();
    }

    protected double salaryForTon() {
        return getManufacturedTons() * getPriceTon();
    }

    protected double allSalary() {
        return salaryForHours() + salaryForTon();
    }

    @Override
    public void salaryInfo() {
        System.out.println("Заработано за робочие часы: " + salaryForHours() + " грн.");
        System.out.println("-----");
        System.out.println("Заработано за тоннаж: " + salaryForTon() + " грн.");
        System.out.println("----------");
        System.out.println("Заработанно: " + allSalary() + " грн.");
    }
}
