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
public class L5q5 {
    public static void main (String [] args){
        Scanner get=new Scanner (System.in);
        
        System.out.print("Please enter your name : ");
        String custName=get.nextLine();
        System.out.print("Please enter the wood type (oak/mahogany): ");
        String woodType=get.nextLine().toLowerCase();
        System.out.print("Please enter number of characters : ");
        int numCharacters=get.nextInt();
        get.nextLine();
        System.out.print("Please enter color of characters (black/white/gold leaf) : ");
        String color=get.nextLine().toLowerCase();
        
        double minCharge=30;
        double price = 0;
        if (woodType.equals("oak")){
           price=minCharge+15;
        }
        else if (woodType.equals("mahogany")){
            price=minCharge+10;
        }
        
        if (numCharacters>6){
            price=(numCharacters-6)*3;
        }
        
        if (color.equals("gold leaf")){
            price=minCharge+12;
        }
        System.out.println("Customer name : " + custName);
        System.out.println("Wood type : " + woodType);
        System.out.println("Number of Characters : " + numCharacters);
        System.out.println("Color of characters : " + color);
        System.out.printf("Total price is RM%.2f", price );
        
    }
    
}
