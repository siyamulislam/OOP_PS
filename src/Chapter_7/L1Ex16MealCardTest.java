/**
 * Level 1 ex 14.  Write a program that tests the Person class defined in Exercise 13. Place this
test program outside of the myutil package and make sure you can call the
constructor and the methods of the Person class correctly.


 *
 */
package Chapter_7;

import myutil.Person;

/**
 *
 * @author Siam_PC
 */
public class L1Ex16MealCardTest {

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getName()); 
        
        person.setName("Siam");
        System.out.println(person.getName());      
    }
}

	
	