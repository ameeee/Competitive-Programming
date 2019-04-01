import java.util.*;

public class Kemija08 {
	
	public static String decodedword(String word){
	
		word = word.replace("apa","a");
		word = word.replace("epe","e");
		word = word.replace("ipi","i");
		word = word.replace("opo","o");
		word = word.replace("upu","u");
		return word;
	} 
	
	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in);
		String[] sentence = x.nextLine().split(" ");
		String s = "";
		
		
		for(int i = 0; i < sentence.length; i++){
			s+= decodedword(sentence[i]) + " ";
		} 
		
		
		System.out.println(s);
		
	} 
} 