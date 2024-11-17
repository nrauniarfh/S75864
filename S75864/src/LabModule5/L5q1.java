/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabModule5;

import javax.swing.JOptionPane;


public class L5q1 {

    public static void main(String[] args) {
        int currentYear=2024;
       String input=JOptionPane.showInputDialog("Enter IC number : ");
       
       String yearPart=input.substring(0,2);
       String monthPart=input.substring(2,4);
       String dayPart=input.substring(4,6);
       
       int birthYear=Integer.parseInt(yearPart);
       int month=Integer.parseInt(monthPart);
       int day=Integer.parseInt(dayPart);
       
       if (birthYear <=24){
           birthYear+=2000;
       }
       else if (birthYear >24){
           birthYear+=1900;
       }
       
       int age =currentYear - birthYear;
       String message=String.format("Birth date is %02d-%02d-%d \nage %d", day,month,birthYear,age);
       JOptionPane.showMessageDialog(null,message);
    }
    
}


    

