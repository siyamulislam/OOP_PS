/**
 * Level 1 ex 13. Modify the following class to make it a part of the package named myutil. In
addition to adjusting the source file, what are the steps you need to take so
that the class becomes usable/accessible from other classes that are outside
of this myutil package?

 *
 */
package Chapter_7;

import myutil.Person;

/**
 *
 * @author Siam_PC
 */
public class L1Ex14PersonTest {

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getName());
        
        person.setName("Siam");
        System.out.println(person.getName());
        
    }
}

	
	