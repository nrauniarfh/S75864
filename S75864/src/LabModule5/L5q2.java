/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabModule5;

/**
 *
 * @author auni
 */
import java.util.Scanner;
public class L5q2 {
    public static void main (String[] args){
        Scanner get=new Scanner (System.in);
        double commissionRate;
        
        System.out.print("Please enter your Sales Commission : ");
        double salesCommission=get.nextDouble();
        
        if (salesCommission <10000){
            commissionRate=salesCommission * 0.1;
        }
        else if(salesCommission >=10000 && salesCommission <=15000){
            commissionRate=salesCommission * 0.15;
        }
        else if(salesCommission >15000);
            commissionRate=salesCommission * 0.2;
            
        System.out.printf("The Sales Commission Rate is RM %.2f%n" , commissionRate);
     
    }
    
}
