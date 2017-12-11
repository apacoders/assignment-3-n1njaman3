package assignment3;

import java.util.ArrayList;
import java.util.List;

/**
 * Instructions for this assignment.  Download this template from GitHub, fill in
 * the author comment below with your name and implement the requirements below.
 * 
 * If code is turned in and cannot be compiled, you will receive 0 points.
 * If a requirement is not implemented, you will receive 0 points.
 * Requirements are worth 50 points each.
 * 
 * @author myname
 * 
 * REQUIREMENT 1:
 * 
 * Create an ArrayList that contains a list of all animals defined in this program (see Animal class)
 * Create a for loop that calls the following methods on the animals:
 * 
 * (a) getLegs()
 * (b) speak()
 * (c) walkTo(0, 1)
 * (d) whereAmI()
 * 
 * See the Animal class for further details
 * 

 
 * 
 
*/
public class Assignment3 {

    public static void main(String[] args) {
        
        Dog Jim = new Dog("Woof",4);
        Cat Tim = new Cat("Meow",4);
        Mouse Joe = new Mouse("Sqeak",4);
        Human Moe = new Human("Gnarly",2);
        
        List<Animal> myAnimal = new ArrayList();
            myAnimal.add(Moe);
            myAnimal.add(Joe);
            myAnimal.add(Tim);
            myAnimal.add(Jim);
            
        
        for(int i=0; i<myAnimal.size();i++){
            System.out.println(myAnimal.get(i).getLegs());
            System.out.println(myAnimal.get(i).speak());
            myAnimal.get(i).walkTo(0,1);
            System.out.println(myAnimal.get(i).whereAmI());
        }
    }
    
}
