import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TellMeTheFrequencies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0;
		while (s.hasNextLine()) {
		   String m=s.next();
		    hash(m);
		    System.out.println();
		    i++;
		}

	}
	private static void hash(String p) {
		Map<Character,Integer>a=new HashMap<Character,Integer>();
		for (int i = 0; i < p.length(); i++) {
			if(!a.containsKey(p.charAt(i))){
				a.put(p.charAt(i), 1);
			}
			else{
				int value=a.get(p.charAt(i));
				value++;
				a.put(p.charAt(i), value);
				
			}
		}
		int[]sort=new int[a.size()];
		int j=0;
		for(Map.Entry<Character, Integer>entry:a.entrySet()){
			sort[j]=entry.getValue();
			j++;
		}
		Arrays.sort(sort);
		for (int i = 0; i < sort.length; i++) {
			print(sort[i],a);
		}
		
	}
	private static void print(int i,Map<Character,Integer>a) {
		for(char m:a.keySet()){
			if(a.get(m)==i){
				System.out.println((int)m+" "+a.get(m));
				a.remove(m);
				break;
			}
		}
		
	}

}
