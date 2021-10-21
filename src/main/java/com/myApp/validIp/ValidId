package com.myApp.validIp;

import java.util.Scanner;

public class ValidIp {

  public static String inputStr;

  public static boolean validIP (String ip) {
    try {
        if ( ip == null || ip.isEmpty() ) {
            return false;
        }

        String[] parts = ip.split( "\\." );
        if ( parts.length != 4 ) {
            return false;
        }

        for ( String s : parts ) {
            int i = Integer.parseInt( s );
            if ( (i < 0) || (i > 255) ) {
                return false;
            }
        }
        if ( ip.endsWith(".") ) {
            return false;
        }

        return true;
    } catch (NumberFormatException nfe) {
        return false;
    }
  }

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
   
     do {
       System.out.println("Enter IP address or \'quit\' to exit");
       inputStr = scan.nextLine();
       validIP(inputStr);
       System.out.println(inputStr);
     }
     while (!inputStr.equals("quit"));
     
  }

}
