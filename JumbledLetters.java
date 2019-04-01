import java.util.*;

public class JumbledLetters {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for (int i = 0; i < n; i++) {
			String s = x.next();
			int p = x.nextInt();
			int[] arr = new int[p];
			int[]sort=new int[p];
			for (int j = 0; j < p; j++) {
				String e=x.next();
				arr=count(s,e);
				int count=sortString(arr);
				sort[j]=count;
			}
			System.out.println("p"+p);
	}
		
	}
	public static int sortString(int []h){
		int count=0;
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if(h[i]>h[j] && i!=j){
					count++;
				}
			}
		}
		return count;
	}

	public static int[] count(String s, String m) {
		int count = 0;
		int arr[] = new int[m.length() ];
		String h = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < m.length(); j++) {
				if (s.charAt(i) == m.charAt(j)) {
					h += arr[count] = i;
					if (count < arr.length)
						count++;
				}
			}
		}
		return arr;
	}

}
