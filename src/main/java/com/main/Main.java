package com.main;

import com.myApp.SalaryDay;
import com.myApp.SalaryMonth;


public class Main {
    public static void main(String[] args) {
        SalaryDay salaryDay = new SalaryDay(5, 4);
        salaryDay.salaryInfo();

        SalaryMonth salaryMonth = new SalaryMonth();
        salaryMonth.salaryInfo();
    }
}
