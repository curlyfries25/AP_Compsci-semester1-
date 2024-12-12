/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 //int [] arr = new int[1001];
		 //int len = arr.length;
		 //int c = 0;
		 //while(c < arr.length){
		 //	arr[c] = (c+1)*3;
		 //	System.out.println("index: " + c + " value: " + arr[c]);
		 //	c++;
		 //}
		  
		 for(c = 0; c < arr.length; c++){
		 	arr[c] = (c+1)*3;
		 	System.out.println("Index: " + c);
		 }
		 
		 int [] arr2 = new int[1001];
		 int Len = arr2.length;
		 int z = 0;
		 while(z < arr2.length){
		 	arr2[z] = arr2.length - 1 - z;
		 	System.out.println("index: " + z + " value: " + arr[z]);
		 	z--;
		 } 
	}
}
