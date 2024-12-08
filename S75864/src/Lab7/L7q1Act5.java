/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author auni
 */
public class L7q1Act5 {

    private static int j;
     public static void main (String []args){
        double rent=800.00;
        DateTimeFormatter get = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        
        int i=1;
         
        do{
            int u =1;
            do{
                int month=1;
                do{
                    LocalDate date=LocalDate.of(2016,month,1).with(TemporalAdjusters.lastDayOfMonth());
                    String formattedDate = date.format(get);
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println("Payment Coupon for " + date.getMonth());
                    System.out.println("Building No : " + i + "\t\t" + "Unit No : " + u );
                    System.out.println();
                    System.out.printf("Amount of rent :RM %.2f" , rent);
                    System.out.println("\nRent due : " + formattedDate);
                month++;    
                }while (month<=12);while (i<=20);
            u++;    
            }while (u<=15);
        i++;    
        }while (i<=20);
        
        
        
    }
    
}
