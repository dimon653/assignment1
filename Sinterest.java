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
public class Sinterest {
       public static void main(String[] args){
           int principal,rate,time,si;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter principal amount :");
           principal=sc.nextInt();
           
           System.out.println("Enter rate per annum :");
           rate=sc.nextInt();
           
           System.out.println("Enter time :");
           time=sc.nextInt();
         
           sc.close();
           si =(principal * rate * time)/ 100;
           System.out.println("The sum of two numbers is: Rs."+si);
       }
}
