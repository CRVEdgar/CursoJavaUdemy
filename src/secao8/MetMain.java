/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao8;

import java.util.Scanner;
import secao8.ClassConvert;

/**
 *
 * @author Edgar
 */
public class MetMain {
    
   // Locale.setDefault(Locale.US);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = ClassConvert.dollarToReal(amount, dollarPrice);
        
        System.out.print("What is the dollar price? ");
        double dollarPrice2 = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount2 = sc.nextDouble();
        double result2 = ClassConvert.dollarToReal(amount2, dollarPrice2);
    
        System.out.println("VALOR 1: " + result);
        System.out.println("VALOR 2: " + String.format("%.2f", result2) );
        sc.close();   
    }
    
}
