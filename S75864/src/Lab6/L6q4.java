/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author auni
 */

public class L6q4 {
    public static void main (String []args){
        
        double fee=4000.0;
        double newFee = fee;
        double rate=0.05;
        double totalCost=0;
        
        int year=1;
        while(year<=10){
            newFee=newFee*(rate+1);
            year++;
        }
        double feeThisYear = fee;
        year=1;
        while(year<5){
            totalCost=totalCost+feeThisYear;
            feeThisYear=feeThisYear*(1+rate);
            year++;
        }
        System.out.printf("Tuition fee in 10 years: RM%.2f%n", newFee);
        System.out.printf("Total cost of 4 years starting from now: RM%.2f%n", totalCost);
        
    }
    
}
