/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
		Dog max = new Dog("max");
		max.setAge(7);
		
		Dog jack = new Dog("jack","german shepherd");
		
		
		if(max.isSleeping() == true){
			System.out.println("it's asleep");
		}
		else{
			max.bark();
			jack.bark();
		}
	}
}
