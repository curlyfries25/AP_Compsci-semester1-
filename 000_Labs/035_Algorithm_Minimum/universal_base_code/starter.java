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
		
		int [] arr = new int[(int)(Math.random()*150)+ 50];
		
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*101); 
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(min);
		
		
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*101);
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		int total = 0;
		for(int i = 0; i < 20; i++){
			total += arr[(int)(Math.random()*arr.length)];
			
		}
		System.out.println((double)(total)/20);
		
		System.out.println(arr.length);
	}
}
