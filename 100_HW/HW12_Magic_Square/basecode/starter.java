import pkg.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		// System.out.println(CVMath.findMid(2,3,1));
		//if it has a special square, print out __ special square
		// a while loop: keep adding the values until you reach the a sum that = your perfect square
		int perfect = 0;
		int i = 1;
		int n = 3;
		while(perfect < n){
			int sqr = i * i; // the special square 
			
			int total = 0; // the sum of the integers
			
			int j = 1;
			
			while(true){
				
				total+=j;
				
				if(total >= sqr){
					break;
				}
				
				j++;
			}
			if(total == sqr){
				System.out.println(sqr);
				perfect++;
			}
			i++;
		}
		
		System.out.println(perfect + " special squares");
		
	}
}
