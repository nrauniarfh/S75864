/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author auni
 */
import java.util.Scanner;
public class L4q6 {
    
public class Activity6labmodule4 {

    
    public static void main(String[] args) {
        
       Scanner get=new Scanner (System.in);
       
       System.out.print("Enter value 1 : ");
       double value1=get.nextDouble();
       
       System.out.print("Enter value 2 : ");
       double value2=get.nextDouble();
       
       System.out.print("Enter value 3 : ");
       double value3=get.nextDouble();
       
       double mean=(value1+value2+value3)/3;
       double variance=(Math.pow((value1-mean),2)+Math.pow((value2-mean),2)+ Math.pow((value3-mean),2))/3;
       double standardDeviation=Math.sqrt(variance);
       
       System.out.printf("The mean is %.2f%n"  , mean);
       System.out.printf("The variance is %.2f\n" , variance);
       System.out.printf("The standard deviation is %.2f\n " , standardDeviation);
        
       
       
    }
    
}

    
}
