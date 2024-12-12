/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class Spiderman {
	String n;
	int a;
	String v;
	
	public Spiderman(String n){
		this.n = n;
		this.a = 0;
		this.v = "none";
	}
	
	public Spiderman(){
		this.n = "Miles Morales";
		this.a = 13;
		this.v = "King Pin";
	}
	
	public Spiderman(String n, int a){
		this.n = n;
		this.a = a;
		this.v = "none";
	}
	
	public Spiderman(String n, String v){
		this.n = n;
		this.a = 0;
		this.v = v;
	}
	public Spiderman(String n, int a, String v) {
		
	}
	
	
	public void setAge(int a){ 
		this.a = a;
	}
	
	public void setVillain(String v){
		this.v = v;
	}
	
	public void print(){
		System.out.println(" ");
		System.out.println("--------------------------------");
		System.out.println("The actor " + n + " is " + a + " years old.");
		System.out.println("They play Spiderman who's villain is " + v + ".");
		System.out.println("--------------------------------");
		System.out.println(" ");
	}
}

public class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman spidey1 = new Spiderman();								// Default constructor
		Spiderman spidey2 = new Spiderman("Tobey Maguire");					// String constructor
		Spiderman spidey3 = new Spiderman("Andrew Garfield", 39);			// String, int constructor
		Spiderman spidey4 = new Spiderman("Tom Holland", "The Vulture");	// String, String constructor

		// Default Prints
		spidey1.print();
		spidey2.print();
		spidey3.print();
		spidey4.print();

		System.out.println("--------------NOW TO CHANGE THE DATA--------------");

		//Mutator methods
		spidey2.setAge(47);
		spidey2.setVillain("Green Goblin");
		spidey2.print();
		

		spidey3.setVillain("Electro");
		spidey3.print();

		spidey4.setAge(26);
		spidey4.print();

	}
}
