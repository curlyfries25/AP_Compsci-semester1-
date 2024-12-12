/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] x){
		
		for(int i = 0; i < x.length; i++){
			System.out.println( x [i] );
		}
		
	}
	
	public static int getArrayAverage(int [] y){
		int sum = 0;
		for(int i = 0; i < y.length; i++){
			sum = y[i] + sum;
		}
		int avg = sum/y.length;
		return avg;
	}
	
	public static int getArrayMax(int [] z){
		int max = z[0];							//its this one
		
		for(int i = 0; i < z.length; i++){
			if(z[i] > max){
				max = z[i];
			}
		}
		
		return max;
	}
	
	public static int getArrayMin(int [] arr){
		 int min = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        return min;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		int [] Array = new int[100];
		for(int i = 0; i < Array.length; i++){
			Array[i] = (int)(Math.random()*100+1);
		}
		
		toStringArray(Array);
		
		System.out.println(getArrayAverage(Array));
		
		System.out.println(getArrayMax(Array));
		
		System.out.println(getArrayMin(Array));
		
	}
}
