package com.example;

public class TestArray {

  public static void main(String[] args) {
      int[] intArray = new int[] {9, 48, 75, 46, 72, 18};

      // Вариант цыкла for 1:
      for (int i = 0; i < intArray.length; i++) {
          System.out.println(intArray[i]);
      }

      // Вариант цыкла for 2:
      for (int i : intArray) {
          System.out.println(i);
      }
  }
}
