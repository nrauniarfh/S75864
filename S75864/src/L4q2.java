/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author auni
 */
 import javax.swing.JOptionPane;
public class L4q2 {
    
public class Activity2Labmodule4 {

    
    public static void main(String[] args) {
       String input=JOptionPane.showInputDialog("Enter the radius of a circle :");
       double radius=Float.parseFloat(input);
       
       double diameter=2*radius;
       double circumference=2*3.14159*radius;
       double area=3.14159*(radius*radius);
       String message=String.format("The diameter is %.2f", diameter)+
                      String.format("\nThe circumference is %.2f", circumference)+
                      String.format("\nThe area is %.2f", area);
        JOptionPane.showMessageDialog(null, message);

    
}
}
}

