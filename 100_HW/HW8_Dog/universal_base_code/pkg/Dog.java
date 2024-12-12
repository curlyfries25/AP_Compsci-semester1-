package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	String name;
	int age;
	String breed;
	
	
	public Dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	
	public Dog(String n) {
		name = n;
		age = 1;
		breed = new String("dog dog");
	}
	
	public Dog(String n, String b) {
		name = n;
		age = 1;
		breed = b;
	}
	
	public Dog(String n, int a) {
		name = n;
		age = a;
		breed = new String("dog dog");
	}
	
	
	public void setAge(int age) {
		return; // to change the age, use ___.age = age;
	}
	
	public void setBreed(String breed) {
		return;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		if(Math.random()<0.5){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks");
	}

}
