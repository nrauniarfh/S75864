/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author auni
 */
public class L7q1Act4 {
    public static void main (String []args){
        
        double fee=4000.0;
        double newFee = fee;
        double rate=0.05;
        double totalCost=0;
        
        int year=1;
        do{
            newFee=newFee*(rate+1);
            year++;
        }while(year<=10);
        double feeThisYear = fee;
        year=1;
       do{
            totalCost=totalCost+feeThisYear;
            feeThisYear=feeThisYear*(1+rate);
            year++;
        } while(year<5);
        System.out.printf("Tuition fee in 10 years: RM%.2f%n", newFee);
        System.out.printf("Total cost of 4 years starting from now: RM%.2f%n", totalCost);
        
    }
}
