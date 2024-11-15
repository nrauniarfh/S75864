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
public class L4q4 {
    
public class Activity4labmodul4 {

    
    public static void main(String[] args) {
       String input=JOptionPane.showInputDialog("Enter the statement :");
       String Statement;
       
       String upperStatement=input.toUpperCase();
       String lowerStatement=input.toLowerCase();
       
       String message=String.format("Result :")+
                      String.format("\nThe uppercase:%s",upperStatement )+
                      String.format("\nThe lowercase :%s", lowerStatement);
       
       JOptionPane.showMessageDialog(null, message);
               
    }
    
}

}
