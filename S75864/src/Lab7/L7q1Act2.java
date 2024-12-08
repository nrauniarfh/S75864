/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author auni
 */
public class L7q1Act2 {
     public static void main (String[]args){
        int kilogram=1;
        double pound=0;
        
       do{
            pound=kilogram*2.2;
            System.out.printf( "%d\t%.1f%n ",kilogram  ,  pound);
            kilogram +=2;
       } while (kilogram <200);
    }
    

    
}
