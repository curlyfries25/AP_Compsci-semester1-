/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String n;
	int a;
	String v;
	
	public Spiderman(String n){
		this.n = n;
		this.a = 0;
		this.v = "none";
	}
	
	public Spiderman(){
		this.n = "Miles Morales";
		this.a = 13;
		this.v = "King Pin";
	}
	
	public Spiderman(String n, int a){
		this.n = n;
		this.a = a;
		this.v = "none";
	}
	
	public Spiderman(String n, String v){
		this.n = n;
		this.a = 0;
		this.v = v;
	}
	public Spiderman(String n, int a, String v) {
		
	}
	
	
	public void setAge(int a){
		this.a = a;
	}
	
	public void setVillain(String v){
		this.v = v;
	}
	
	public void print(){
		System.out.println("--------------------------------");
		System.out.println("The actor " + n + " is " + a);
		System.out.println("They play Spiderman who's villain is " + v);
		System.out.println("--------------------------------");
	}
}
