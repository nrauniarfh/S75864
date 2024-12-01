/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author auni
 */
import java.util.Scanner;
public class L6q3 {
    public static void main (String[]args){
        int first,second;
        Scanner get=new Scanner (System.in);
        do {
            System.out.print("Enter first integer : ");
            first =get.nextInt();
            System.out.print("Enter second integer : ");
            second =get.nextInt();
            
            if (first>=second)
                System.out.println("Error:First number must be less than second");
        }
        while (first>=second);
        System.out.println("Odd number between " + first + " and " + second + " number  ");
        int test_number=first;
    
       
        while (test_number<=second){
            if (test_number%2 !=0){
                System.out.print(test_number + " ");
            }    
            test_number++;
        }
        System.out.println();
        
        System.out.println("Even number between " + first + " and " + second + " number");
        test_number=first;
        while (test_number <=second){
            if(test_number%2 ==0){
                System.out.print(test_number + " ");
            }
            test_number++;
        }
        System.out.println();
    }
}
    

