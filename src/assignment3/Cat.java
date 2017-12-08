/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author bradley.blanchard
 */
public class Cat extends Animal {
 /*    * CAT CLASS REQUIREMENTS
 * 
 * You will need to create a new class called Cat that extends Animal.  It will need
 * to implement the method walkTo.  The requirements on WalkTo are:
 * 
 * 
 * CAT_REQUIREMENT 1:
 * 
 * This class has no new parameters - the parameters it uses are the ones defined in Animal
 * Has an implementation of the method WalkTo.  When walk to is called, it will:
 * 
 * Print "Walking"
 * Print "Lying Down"
 * Set the coordinates of where it was told to walk to.  It must use the Animal coordinates
 * 
 * It must call the protected constructor on the Animal and set:
 * 
 * legs to 4 and soundParameter to Meow
 */

    public Cat(String speakParameter, int numberOfLegs) {
        super(speakParameter, numberOfLegs);
    }

    @Override
    public void walkTo(int x, int y) {
        System.out.println("Walking to... "+x+", "+y);
        System.out.println("Lying down");
        
    }
    
    
}
