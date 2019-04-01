import java.util.*;

public class Herman {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int r = x.nextInt();
		double usual = Math.PI * r * r;
		System.out.printf("%.6f",usual);
		System.out.println();
		double new1=r*r*2;
		System.out.printf("%.6f",new1);
	}
}
