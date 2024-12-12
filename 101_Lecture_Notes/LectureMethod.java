/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise(200000.42, 5);
        System.out.println(num);
        num = raise(num,5);
        System.out.print(num);
        
	}
	
	public static void greeting(String name){
	    System.out.println("Hello " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("((_,...,_))    ");
	    System.out.println("   |o o|");
	    System.out.println("   \\   /");
	    System.out.println("    ^_^ ");
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	    
	}
}