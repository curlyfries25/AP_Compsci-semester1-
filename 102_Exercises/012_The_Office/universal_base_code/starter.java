/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		
		Employee Ryan = new Employee(3469, "Ryan", "King", 1423.50);
		Ryan.employeeToString();
		
		michael.raiseSalary(3);
		
		Dwight.raiseSalary(3);
		
		Jim.raiseSalary(3);
		
		Pam.raiseSalary(3);
		
		Ryan.raiseSalary(3);
		
		System.out.println(michael.getAnnualSalary());
		
		System.out.println(Dwight.getAnnualSalary());
		
		System.out.println(Jim.getAnnualSalary());
		
		System.out.println(Pam.getAnnualSalary());
		
		System.out.println(Ryan.getAnnualSalary());
	}
}
