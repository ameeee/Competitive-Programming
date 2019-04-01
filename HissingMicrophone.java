import java.util.*;

public class HissingMicrophone {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s = x.next();
		int count = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == 's' && s.charAt(i + 1) == 's') {
				count++;
			}

		}
if (count>0){
	System.out.println("hiss");
}
else{
	System.out.println("no hiss");
}
	}

}
