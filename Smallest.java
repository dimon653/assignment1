/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;

/**
 *
 * @author Dimon
 */

import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
           int a,b,c,smallest;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter first value :");
           a=sc.nextInt();
           
           System.out.println("Enter second value:");
           b=sc.nextInt();
           
           System.out.println("Enter third value :");
           c=sc.nextInt();
           
           sc.close();
            smallest= Math.min(Math.min(a, b), c);
             System.out.println("The smallest is:" +smallest +"\n");  
    }
}

           
        
 
