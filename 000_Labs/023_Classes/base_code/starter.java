/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Warrior");
	
	int Strength = 8;
	int Dexterity = 6;
	int Intelligence = 7;
	int Charisma = 7;
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character Samurai = new Character();
		System.out.println(Samurai.role);
		
		System.out.println(Samurai.Strength);
		System.out.println(Samurai.Dexterity);
		System.out.println(Samurai.Intelligence);
		System.out.println(Samurai.Charisma);
	}
}
