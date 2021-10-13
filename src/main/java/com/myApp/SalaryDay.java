package com.myApp;

public class SalaryDay {

    private final double priceHours = 62.5;
    private final double priceTon = 75;
    private double workingHours;
    private double manufacturedTon;

    public SalaryDay(double workingHours, double manufacturedTon) {
        this.workingHours = workingHours;
        this.manufacturedTon = manufacturedTon;
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
    
    protected double getManufacturedTon() {
      return manufacturedTon;
    }
    
    protected double salaryForHours() {
        double salaryForHours = workingHours * priceHours;
        return salaryForHours;
    }
    
    protected double salaryForTon() {
        double salaryForTon = manufacturedTon * priceTon;
        return salaryForTon;
    }
    
    protected double allSalary() {
        double allSalary = salaryForHours() + salaryForTon();
        return allSalary;
    }
    
    public void SalaryInfo() {
    	System.out.println("Заработано за робочие часы: " + salaryForHours() + " грн.");
    	System.out.println("-----");
    	System.out.println("Заработано за тоннаж: " + salaryForTon() + " грн.");
    	System.out.println("----------");
    	System.out.println("Заработанно: " + allSalary() + " грн.");
  }
}
