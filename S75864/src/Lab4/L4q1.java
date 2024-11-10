/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author auni
 */
public class L4q1 {
    public static void main(String[] args) {
    Scanner get=new Scanner (System.in);
    
    System.out.print("Enter first integer : ");
    int number1=get.nextInt();
    System.out.print("Enter second integer : ");
    int number2=get.nextInt();
    
    int square1=number1*number1;
    int square2=number2*number2;
    int sumSquare=square1+square2;
    int diffSquare=square1-square2;
    
    System.out.println("The square of " + number1 + " is " + square1);
    System.out.println("The square of " + number2 + " is " + square2);
    System.out.println("The sum of their square is " + sumSquare);
    System.out.println("The differences oh their square is : " + diffSquare);
    }
    
}
