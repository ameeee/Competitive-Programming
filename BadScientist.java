import java.util.*;

public class BadScientist {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int nboftestcases = x.nextInt();
		for (int j = 0; j < nboftestcases; j++) {
			int nboftheories = x.nextInt();
			int maximumnumber = x.nextInt();
			int nboftheorypairs = x.nextInt();
			int pairs[] = new int[nboftheorypairs * 2];
			for (int i = 0; i < pairs.length; i++) {
				pairs[i] = x.nextInt();
			}
			if (nboftheorypairs == 0) {
				System.out.println(0);
			} else if (nboftheorypairs > 0 && maximumnumber == 0) {
				System.out.println("IMPOSSIBLE");
			} else {
				int discarded = discardednumber(pairs);
				if (discarded <= maximumnumber) {
					System.out.println(discarded);
				} else {
					System.out.println("IMPOSSIBLE");
				}

			}
		}
	}

	public static int discardednumber(int[] pairs) {
		int counter = 0;
		boolean check[] = new boolean[pairs.length];
		for (int i = 0; i < pairs.length; i++) {
			for (int j = 0; j < pairs.length; j++) {
				if (pairs[i] == pairs[j] && i != j) {
					int index = OccurenceIndex(pairs, pairs[i]);
					check[index] = true;
				}
			}
		}
		for (int j = 1; j < check.length - 1; j++) {
			if (check[j] == false && check[j + 1] == false
					&& check[j - 1] != true
					&& findOccurence(pairs, pairs[j + 1]) == 1
					&& findOccurence(pairs, pairs[j]) == 1) {
				check[j] = true;
			}
			if (check[check.length - 1] == false
					&& check[check.length - 2] == false) {
				check[check.length - 1] = true;
			}
		}
		for (int i = 0; i < check.length; i++) {
			if (check[i] == true) {
				counter++;
			}

		}
		if (counter > 4) {
			return (counter / 2 + 1);
		} else {
			return counter;
		}

	}

	public static int findOccurence(int[] pairs, int number) {
		int counter = 0;
		for (int i = 0; i < pairs.length; i++) {
			if (number == pairs[i]) {
				counter++;
			}
		}
		return counter;
	}

	public static int OccurenceIndex(int[] pairs, int number) {
		int index = 0;
		for (int i = 0; i < pairs.length; i++) {
			if (pairs[i] == number) {
				index = i;
			}
		}
		return index;
	}

}
