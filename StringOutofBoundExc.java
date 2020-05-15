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
public class StringOutofBoundExc {
       public static void main(String args[])
    {
        try{
            String str="introtoalgorithms";
            System.out.println(str.length());;
            char c = str.charAt(0);
//            an index is invoked of a string, which is not in the range.
            c = str.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
}
