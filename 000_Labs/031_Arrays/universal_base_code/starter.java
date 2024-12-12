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
		int [] arr = new int[10];
		int len = arr.length;
		int i = 0; 
		arr[0] = 9;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 6;
		arr[4] = 5;
		arr[5] = 4;
		arr[6] = 3;
		arr[7] = 2;
		arr[8] = 1;
		arr[9] = 0;
		while(i < arr.length){
			System.out.println(arr[i]);
			i++;
		}
		
	}
}
