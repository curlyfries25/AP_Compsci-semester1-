/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Warrior[] WARRIOR = new Warrior[100];
		Wizard[] WIZARD = new Wizard[100];
		
		boolean wizattack = true;
		
		int WizIndex = 0;
		int WarIndex = 0;
		WARRIOR[0] = new Warrior();
		WIZARD[0] = new Wizard();
		
		while(WizIndex < 100 && WarIndex < 100){
			
			if(wizattack){
				WIZARD [WizIndex].attack(WARRIOR[WarIndex]);
				
				if(WARRIOR[WarIndex].isDead()){
					WarIndex++;
					
					
					if(WarIndex != 100){
						WARRIOR[WarIndex] = new Warrior();
					}
				}
				wizattack = false;
			}
			else{
				WARRIOR [WarIndex].attack(WIZARD[WizIndex]);
				
				if(WIZARD[WizIndex].isDead()){
					WizIndex++;
					 
					
					if(WizIndex != 100){
						WIZARD[WizIndex] = new Wizard();
					}
				}
				wizattack = true;
			}
		}
		
		if(WizIndex == 100){
			System.out.println("The Warriors reign victorious with " + (100 - WarIndex) + " warriors to spare.");
		}
		else{
			System.out.println("The Wizards reign victorious with " + (100 - WizIndex) + " wizards to spare.");
		}
	}
}
