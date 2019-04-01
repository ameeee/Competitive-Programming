import java.math.BigInteger;
import java.util.Scanner;

public class BabElHara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int nb = scan.nextInt();
		for (int i = 0; i < nb; i++) {
			int cases = scan.nextInt();
			long z = 1;
			for (int j = 0; j < cases; j++) {
			long x = scan.nextLong();
				z *=x;
			}
			long ans = bablhara(z);
			long m = (int) (ans % (Math.pow(10, 9) + 7));
			System.out.println("Case " + (i + 1) + ": " + m);

		}
	}

	public static long bablhara(long n) {
		int sum = 0;
		double x = Math.sqrt(n);

		if ((int) x == x)
		sum += (int) x;

		for (int i = 2; i < x; i++)
		if (n % i == 0)
		sum += i + (n / i);

		return sum + 1+ n;
		}
}