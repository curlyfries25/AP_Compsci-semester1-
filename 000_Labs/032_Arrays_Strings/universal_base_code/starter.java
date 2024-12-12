/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String song [] = new String[10];
		int len = song.length;
		int i = 0;
		song[0] = "If I ruled the world (imagine that)";
		song[1] = "I'd free all my sons (I love 'em, love 'em, baby)";
		song[2] = "Black diamonds and pearls";
		song[3] = "(Could it be, if you could be mine, we'd both shine)";
		song[4] = "If I ruled the world";
		song[5] = "(Still living for today, in these last days and times)";
		song[6] = "The way to be paradise life, relaxing";
		song[7] = "Black, Latino, and Anglo-Saxon";
		song[8] = "Armani Exchange, the Range";
		song[9] = "Cash, Lost Tribe of Shabazz, free at last...";
		
		while(i < song.length){
			System.out.println(song[i]);
			i++;
			
		}
		
		
	}
}
