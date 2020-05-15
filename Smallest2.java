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
public class Smallest2 {
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = sc.nextInt();
        System.out.print("Input the Second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

   public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
