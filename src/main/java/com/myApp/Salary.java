package com.myApp;

public class Salary {

    private final double priceHours = 62.5;
    private final double priceTon = 75;
    
    private final double prepayment;
    
    private final double[] workingHours = {};
    private final double[] manufacturedTon = {};
    
    private double allWorkingHours;
    private double allManufturedTon;
        
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
        for(int i = 0; i < workingHours.length; i++) {
            allWorkingHours += workingHours[i];
        }
        return allWorkingHours;
    }
    
    protected double salaryForHours() {
        double salaryForHours = allWorkingHours * priceHours;
        return salaryForHours;
    }
    
    protected double getAllManufturedTon() {
        for(int i = 0; i < manufacturedTon.length; i++) {
            allManufturedTon += manufacturedTon[i];
   	}
   	return allManufturedTon;
    }
    
    protected double salaryForTon() {
        double salaryForTon = allManufturedTon * priceTon;
        return salaryForTon;
    }
    
    protected double allSalary() {
        double allSalary = salaryForHours() + salaryForTon();
        return allSalary;
    }
    
    public void mySalaryInfo() {
   
    	System.out.println("Всего отработанно часов: " + getAllWorkingHours() + "ч.");
    	System.out.println("Заработано за робочие часы: " + salaryForHours() + " грн.");
    	System.out.println("-----");
    	System.out.println("Всего сделано тонн: " + getAllManufturedTon() + "т.");
    	System.out.println("Заработано за тоннаж: " + salaryForTon() + " грн.");
    	System.out.println("----------");
    	System.out.println("Аванс: " + getPrepayment() + " грн.");
    	System.out.println("Зарплата: " + allSalary() + " грн.");
    	System.out.println("Зарплата с вычетом аванса: " + (allSalary() - getPrepayment()) + " грн.");
  }
}

