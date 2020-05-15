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
public class trycatchfinally {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try{
            int i = arr[4];
            
            System.out.println("Inside try block");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    
        System.out.println("Outside try-catch-finally block");
    }
}
