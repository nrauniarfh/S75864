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
public class L5q3 {
    public static void main (String[] args){
        Scanner get=new Scanner (System.in);
        System.out.print("Please enter your account number : ");
        int accNumber=get.nextInt();
        System.out.print("Plese select account type (S:savings) or (C:checking) : ");
        char accType=get.next().charAt(0);
        System.out.print("Please enter your minimum balance :");
        double minBalance=get.nextDouble();
        System.out.print("Please enter your current balance :");
        double currentBalance=get.nextDouble();
        
        
         if (accType!='S' && accType!='C') {
            System.out.print("Undefied account type");
        }     
        double newBalance;
        if (accType =='S'){
            if (currentBalance < minBalance){
                newBalance=currentBalance-10;}
            else{
                newBalance=(currentBalance*0.04)+currentBalance;}
        System.out.println("Account Number :" + accNumber);
        System.out.println("Account Type: " + (accType == 'S' || accType == 's' ? "Savings" : "Checking"));
        System.out.printf("Current Balance: RM%.2f%n", currentBalance);
        System.out.printf("New Balance: RM%.2f%n", newBalance);
        }
        
         
        
        else if(accType =='C'){
            if (currentBalance<minBalance){
                newBalance=currentBalance-25;}
            else{
                if (currentBalance <=minBalance +5000){
                    newBalance =(currentBalance*0.03)+currentBalance;}
                else{
                    newBalance =(currentBalance*0.05)+currentBalance;}
            }
        System.out.println("Account Number :" + accNumber);
        System.out.println("Account Type: " + (accType == 'S' || accType == 's' ? "Savings" : "Checking"));
        System.out.printf("Current Balance: RM%.2f%n", currentBalance);
        System.out.printf("New Balance: RM%.2f%n", newBalance);
        }
        
        
        
            
        
        
        
              
          
        }
        
        
    }
    

