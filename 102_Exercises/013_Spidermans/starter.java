/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		x.setActor("Toby Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");

		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(38);
		z.setVillain("The vulture");
		
		System.out.println("The villain is " + y.getVillain());
		
		Spiderman m = new Spiderman();
		m.setActor("Shameik Moore");
		m.setAge(18);
		m.setVillain("Kingpin");
	}
}
