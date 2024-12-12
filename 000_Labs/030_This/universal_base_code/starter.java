/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf first = new PooleDwarf(randName(),34);
		PooleDwarf second = new PooleDwarf(randName(),34);
		PooleDwarf third = new PooleDwarf(randName(),34);
		PooleDwarf fourth = new PooleDwarf(randName(),34);
		PooleDwarf fifth = new PooleDwarf(randName(),34);
		PooleDwarf sixth = new PooleDwarf(randName(),34);
		PooleDwarf seventh = new PooleDwarf(randName(),34);
		
		int duplicate = 0;
		
		System.out.println(first.getName());
		System.out.println("________________");
		System.out.println(second.getName());
		System.out.println(third.getName());
		System.out.println(fourth.getName());
		System.out.println(fifth.getName());
		System.out.println(sixth.getName());
		System.out.println(seventh.getName());
		
		
		if(first.isSameName(second.getName())){
			duplicate++;
		}
		
		if(first.isSameName(third.getName())){
			duplicate++;
		}
		
		if(first.isSameName(fourth.getName())){
			duplicate++;
		}
		
		if(first.isSameName(fifth.getName())){
			duplicate++;
		}
		
		if(first.isSameName(sixth.getName())){
			duplicate++;
		}
		
		if(first.isSameName(seventh.getName())){
			duplicate++;
		}
		
		System.out.println(duplicate);
	}
}
