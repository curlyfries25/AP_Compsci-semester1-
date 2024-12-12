/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[20];
		
		int i = 0;
		
		while(i<20){
			arr[i] = (int)(Math.random()*11)+1;
			i++;
		}
		
		int target = (int)(Math.random()*11)+1;
		
		i = 0;
		int d = 0;
		
		while(i < arr.length){
			
			if(target == arr[i]){
				System.out.println(i);
				d++;
			}
			i++;
		}
		System.out.println(d);
		
		i = 0;
		
		while(i < arr.length-1){
			
			if(arr[i] == arr[i+1]){
				System.out.println("index 1: " + i + " index 2: " + (i+1) + " value: " + arr[i]);
			}
			i++;
		}
		
	}
}
