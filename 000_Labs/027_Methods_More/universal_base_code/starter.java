/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class character{
	
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	String setRole(String r){
		
		role = r;
		
		if(role.equals("wizard")){
			System.out.println("you've chosen wizard");
		}
		else if(role.equals("warrior")){
			System.out.println("you've chosen warrior");
		}
		else if(role.equals("rogue")){
			System.out.println("you've chosen rogue");
		}
		else{
			System.out.println("no role");
		}
		
		return role;
	}
	
	void myToString(){
		System.out.println(role);
		System.out.println(strength);
		System.out.println(dexterity);
		System.out.println(intelligence);
		System.out.println(charisma);
		
	}
	
	int setStrength(int s){
		strength = s;
		return strength;
	}
	
	int setDexterity(int d){
		dexterity = d;
		return dexterity;
	}
	
	int setIntelligence(int i){
		intelligence = i;
		return intelligence;
	}
	
	int setCharisma(int c){
		charisma = c;
		return charisma;
	}
	
	boolean setAll(String r, int s, int d, int i, int c){
		return true;
	}
}

class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		character myCharacter = new character();
		
		myCharacter.setRole("wizard");
		
		myCharacter.setStrength(1);
		
		myCharacter.setDexterity(2);
		
		myCharacter.setIntelligence(3);
		
		myCharacter.setCharisma(4);
		
		
		myCharacter.setAll("wizard", 1, 2, 3, 4);
		
		
		myCharacter.myToString();
		
		
	}
}
