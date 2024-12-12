/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You will start with $100.00");
		
		double cash = 100;
		
		while(true){
			System.out.println("How much are you willing to wager right now?");
			double wager = sc.nextDouble();
			
			int num1 = (int)(Math.random()*10);
			int num2 = (int)(Math.random()*10);
			int num3 = (int)(Math.random()*10);
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
			
			if(num1 == num2 || num1 == num3 || num2 == num1 || num2 == num3){
				System.out.println("Congrats, you've made $" + (cash + wager*2));
				cash = cash + wager*2;
			}
			else if(num1 == num2 && num1 == num3){
				System.out.println("Jackpot!, you've won $" + (cash + wager*3));
				cash = cash + wager*3;
			}
			else{
				System.out.println("That's too bad, you now have $" + (cash - wager));
				cash = cash - wager;
			}
			
			if(cash <= 0.00){
				System.out.println("you're out of money!");
				break;
			}
			
			System.out.println("Would you like to run it again?");
			String answer = sc.next();
			
			if(answer.equals("no")){
				
				System.out.println("you have $" + (cash));
				
				break;
			}
			
		}
	}
}
