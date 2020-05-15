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
public class ArithmeticExc {
     public static void main(String[] args) {
        try{
            int dividend =30;
            int divisor =0;

            int result = dividend/divisor;
            System.out.println("Result:"+result);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero: Divisor cannot be zero");
        }
    }
}
