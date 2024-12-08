/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author auni
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
public class L6q5 {
    public static void main (String []args){
        double rent=800.00;
        DateTimeFormatter get = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        
        int i=1;
        while (i<=20){
            int u =1;
            while (u<=15){
                int month=1;
                while (month<=12){
                    LocalDate date=LocalDate.of(2016,month,1).with(TemporalAdjusters.lastDayOfMonth());
                    String formattedDate = date.format(get);
                    
                    System.out.println("---------------------------------------------------");
                    System.out.println("Payment Coupon for " + date.getMonth());
                    System.out.println("Building No : " + i + "\t\t" + "Unit No : " + u );
                    System.out.println();
                    System.out.printf("Amount of rent :RM %.2f" , rent);
                    System.out.println("\nRent due : " + formattedDate);
                month++;    
                }
            u++;    
            }
        i++;    
        }
        
        
        
    }
    
}
