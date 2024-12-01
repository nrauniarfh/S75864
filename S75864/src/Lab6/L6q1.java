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
public class L6q1 {
    public static void main (String[]args){
        Scanner get=new Scanner(System.in);
        int int_number,sum_num = 0,count_positive = 0,count_negative = 0,count=0;
        double average;
        System.out.print("Enter integer number : ");
        int_number=get.nextInt();
        
        while (int_number !=0){
            
            if (int_number > 0){
                count_positive=count_positive +1;
              }
            else {
                count_negative=count_negative+1;
            }
            sum_num = sum_num +int_number;
            
            count++;
            System.out.print("\nEnter integer number : ");
            int_number=get.nextInt();
            
            
        }
    average=sum_num/count;
    System.out.println("Total positive number : " + count_positive);
    System.out.println("Total negative number : "+count_negative);
    System.out.println("Summation of all integer : " + sum_num);
    System.out.printf("Average : %.2f" , average);
    }
    
}
