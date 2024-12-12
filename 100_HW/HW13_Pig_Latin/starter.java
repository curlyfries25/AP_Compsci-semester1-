/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	
	
	
	public static String Piglatin(String text){
		
		String[] words = text.split(" ");
		
		String vowels = "a e i o u A E I O U";
		for(int i = 0; i < words.length; i++){
			if( !(vowels.contains(words[i].substring(0,1))) && vowels.contains(words[i].substring(1,2)) ){
				String firstchar = words[i].substring(1);
				
				firstchar = firstchar + words[i].substring(0,1) +"ay";
				
				words[i] = firstchar; 
			}
			else if(!(vowels.contains(words[i].substring(0,1))) && !(vowels.contains(words[i].substring(1,2))) ){
				String firstTWO = words[i].substring(2);
				
				words[i] = firstTWO + words[i].substring(0,2) + "ay";
			}
			else if( vowels.contains(words[i].substring(0,1)) ){
				
				String way = words[i] + "way";
				
				words[i] = way;
			}
		}
		
		
		
		return String.join(" ", words);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a phrase: "); 
		String phrase = sc.nextLine();
		System.out.println(Piglatin(phrase));
	}
}
