/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabModule5;

import javax.swing.JOptionPane;
public class L5q4 {
    public static void main (String []args){
         String input=JOptionPane.showInputDialog("Enter date (DD-MM-YYYY) :");
         String[] dateParts = input.split("-");
            int q = Integer.parseInt(dateParts[0]); 
            int m = Integer.parseInt(dateParts[1]); 
            int y = Integer.parseInt(dateParts[2]);
            String dayOfWeek = null;

            if (m == 1 || m == 2) {
                m = m + 12;
                y = y - 1;
            }
            int h= (q + (13 * (m + 1)) / 5 + y + (y / 4) - (y / 100) + (y / 400)) % 7;

            
            switch (h) {
                case 0:
                    dayOfWeek = "Saturday";
                    break;
                case 1:
                    dayOfWeek = "Sunday";
                    break;
                case 2:
                    dayOfWeek = "Monday";
                    break;
                case 3:
                    dayOfWeek = "Tuesday";
                    break;
                case 4:
                    dayOfWeek = "Wednesday";
                    break;
                case 5:
                    dayOfWeek = "Thursday";
                    break;
                case 6:
                    dayOfWeek = "Friday";
               
            }
            
            JOptionPane.showMessageDialog(null,"The day of the week is " + dayOfWeek);
    }
    
    
}
