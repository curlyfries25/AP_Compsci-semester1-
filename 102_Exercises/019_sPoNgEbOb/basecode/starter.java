/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	int x = 0;
	String a;
	
	// public String Spongify(String a){
	// 	//int x = 0;
	// 	//String a;
		
	// 	while(x < a.length()){
	// 		if( x % 2 == 0){
	// 			a.toLowerCase();
	// 		}
	// 		x++;
	// 	}
	// 	return a;
	// }              this was also done by me(wasn't successful)
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a word to sponge case: ");
		String word = sc.nextLine();
		String sentece = sc.nextLine();
		// String result = ""; this is only for the spongecase method
		
		//this code will break up the code based on spaces
		//use this code to traslate the code for piglatin
		while(true){
			if(sentence.indexOf() == -1){
				System.out.println(spongeCase(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.println(spongeCase(word)+ " ");
			sentence = sentencesubstring(space+1);
		}
		
		for(int i = 0; i < wordlength(); i++){
			String letter = word.substring(i, i+1);
			
			
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter; //result+= letter;
			//if you did result = letter + result, it would type the thing backwards
		}
		
		
		// this was done by me(wasn't successful)
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Give me a word to sponge case: ");
		// String text = sc.nextLine();
		// Spongify(text);
	}
	
	//this is Poole's spongecase method
	public static String spongeCase(String word){
			String result = "";
		
		
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			
			
			if(i % 2 == 0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			result = result + letter; //result+= letter;
			
		}
		return result;
	}
}
