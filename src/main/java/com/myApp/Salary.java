package com.myApp;

public class Salary {
    public static void mySalary() {
    double priceHours = 62.5;
    double priceTon = 75;
   
    double[] workingHours = {};
    double allWorkingHours = 0;
    
    double[] manufacturedTon = {};
    double allManufturedTon = 0;
   
    double prepayment = 0;
   
    for(int i = 0; i < workingHours.length; i++) {
        allWorkingHours += workingHours[i];
    }
   
    for(int i = 0; i < manufacturedTon.length; i++) {
        allManufturedTon += manufacturedTon[i];
    }
   
    double salaryForHours = allWorkingHours * priceHours;
    double salaryForTon = allManufturedTon * priceTon;
    double allSalary = salaryForHours + salaryForTon;
   
    System.out.println("Всего отработанно часов: " + allWorkingHours + "ч.");
    System.out.println("Заработано за робочие часы: " + salaryForHours + " грн.");
    System.out.println("-----");
    System.out.println("Всего сделано тонн: " + allManufturedTon + "т.");
    System.out.println("Заработано за тоннаж: " + salaryForTon + " грн.");
    System.out.println("----------");
    System.out.println("Аванс: " + prepayment + " грн.");
    System.out.println("Зарплата: " + allSalary + " грн.");
    System.out.println("Зарплата с вычетом аванса: " + (allSalary - prepayment) + " грн.");
  };  
};
