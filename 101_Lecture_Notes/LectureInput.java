/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Please enter a number:");
        int one = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Please enter another number:");
        int two = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of the numbers is: " + (one + two));
        
        System.out.println("What's your favorite food?");
        String food = sc.nextLine();
        sc.nextLine();
	}
}