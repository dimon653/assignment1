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
public class AdddTwoNumbers {
       public static void main(String[] args){
           int x,y,sum;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter first number :");
           x=sc.nextInt();
           
           System.out.println("Enter second number :");
           y=sc.nextInt();
           
           sc.close();
           sum=x + y;
           System.out.println("The sum of two numbers is:" +sum);          
}
}
   
