import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Facebook {

	public static void main(String[] args) throws IOException {
		Scanner y = new Scanner(System.in);
		int t = y.nextInt();
		for (int i = 0; i < t; i++) {
			int N = y.nextInt();
			int K = y.nextInt();
			String arr[];
			String s;
			Map<String, Integer> rep = new HashMap<String, Integer>();
			y.nextLine();
			for (int j = 0; j < N; j++) {
				s = y.nextLine();
				arr=s.split(" ");
				if (arr[0].equals("liked")) {
					if (!rep.containsKey(arr[1])) {
						rep.put(arr[1], 1);
					} else {
						int value = rep.get(arr[1]);
						value++;
						rep.put(arr[1], value);
					}
				} else {
					if (!rep.containsKey(arr[2])) {
						rep.put(arr[2], 1);
					} else {
						int value = rep.get(arr[2]);
						value++;
						rep.put(arr[2], value);
					}
				}
			}
			ArrayList<Integer> numb = new ArrayList<Integer>();
			for (Map.Entry<String, Integer> entry : rep.entrySet()) {
				numb.add(entry.getValue());
			}
			Collections.sort(numb);
			System.out.println("Case " + (i + 1) + ":");
			int r = 1;
			for (int j = 0; j < K; j++) {
				String k = getKeyFromValue(rep, numb.get(numb.size() - r));
				String h[] = k.split("'");
				System.out.println(h[0]);
				r++;

			}
		}
	}

	public static String getKeyFromValue(Map<String, Integer> hm, int value) {
		for (String o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}

}
