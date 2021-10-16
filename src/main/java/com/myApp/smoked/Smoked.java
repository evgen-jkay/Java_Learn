package com.myApp.smoked;

import java.util.Scanner;

public class Smoked {

  public static void main(String[] args) {
       System.out.println("Анти курильщик");
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Сколько сигарет ты скуриваешь в день?");
       double cigarettesDay = scan.nextDouble();
       
       System.out.println("Сколько стоит пачка сигарет?");
       double packPrice= scan.nextDouble();
       scan.close();
       
       double priceCigarette = packPrice / 20;
       double smokedDay = cigarettesDay * priceCigarette;
       double smokedMouth = smokedDay * 365 / 12;
       double smokedYear = smokedDay * 365;
       
       System.out.println("И так...");
       System.out.println("Давай посчитаем...");
       System.out.println("Одна сигарета тебе обходится: " + priceCigarette + "грн.");
       System.out.println("В день это " + smokedDay + "грн.");
       System.out.println("А в месяц ты спустил на ветер " + smokedMouth + "грн");
       System.out.println("В год ты просрал целых " + smokedYear + "грн.");
       System.out.println("Ты скурил за год " + cigarettesDay * 365 + " сигарет..."); 
  }

}
