package com.main;

import com.myApp.*;


public class Main {
    public static void main(String[] args) {
        SalaryDay salaryDay = new SalaryDay(0, 0);
        salaryDay.salaryInfo();

        SalaryMonth salaryMonth = new SalaryMonth();
        salaryMonth.salaryInfo();
    }
}
