import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class KefaAndPark {

	private static int[] head, nxt, to;
	private static int n, m, ne,z;
	private static boolean vis[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		vis=new boolean[n];
		init();
		for (int i = 0; i <n; i++) {
			int p=in.nextInt();
			if(p==1)
			vis[i]=true;
		}
	     z=n-1;
		while (z-- > 0) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			addBiEdge(a, b);
		}
		for (int i = 0; i < n; i++) {
		}
		
		

	}

	private static void addBiEdge(int a, int b) {
		addEdge(a, b);
		addEdge(b, a);
	}

	private static void addEdge(int f, int t) {
		nxt[ne] = head[f];
		to[ne] = t;
		head[f] = ne++;
	}

	private static void init() {
		head = new int[n];
		to = new int[2 * n];
		nxt = new int[2 * n];
		Arrays.fill(head, -1);
	}

	private static int dfs(int i) {
		if (vis[i]==true){
			return 1;

		}
		int res = 0;
		for (int k = head[i]; k != -1; k = nxt[k]) {
			int j = to[k];
			res += dfs(j);
		}
		return res;
	}

	static class Scanner {
		public BufferedReader reader;
		public StringTokenizer st;

		public Scanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			st = null;
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null)
						return null;
					st = new StringTokenizer(line);
				} catch (Exception e) {
					throw (new RuntimeException());
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
