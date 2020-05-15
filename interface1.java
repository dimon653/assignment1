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
interface interface1 {
   
    default void show()
    {
        System.out.println("Default interface 1");
    }
}
interface interface2{
  
    default void display(){
        System.out.println("Default interface 2");
    }
}
class MultipleInheritance implements interface1, interface2 {
 
    @Override
    public void display() {
        
        interface1.super.show();
    }
    
    @Override
    public void show() {
        interface2.super.display();
    }

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.show();
        multipleInheritance.display();

    }
}
    
