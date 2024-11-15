/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author auni
 */
 import javax.swing.JOptionPane;
public class L4q5 {
    
public class Activity5labmodule4 {

    
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Enter distance (meter) :");
        double distance=Double.parseDouble(input);
        
        input=JOptionPane.showInputDialog("Enter time (hour) :");
        double hour=Double.parseDouble(input);
        
        input=JOptionPane.showInputDialog("Enter time (minutes) :");
        double minutes=Double.parseDouble(input);
        
        input=JOptionPane.showInputDialog("Enter time (seconds) :");
        double seconds=Double.parseDouble(input);
        
        double sec=(hour*3600)+(minutes*60)+seconds;
        double hours=hour+(minutes/60)+(seconds/3600);
        double metersPerSecond=distance/sec;
        double kiloPerHour=(distance/1000)/hours;
        double milesPerHour=(distance/1609)/hours;
        
        String message=String.format("Speed : ")+
                       String.format("\nMeters per second is %.2f", metersPerSecond)+
                       String.format("\nKilometers per hour is %.2f ", kiloPerHour)+
                       String.format("\nMiles per hour is %.2f", milesPerHour);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}

}
