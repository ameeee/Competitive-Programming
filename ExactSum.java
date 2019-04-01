import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


class ExactSum {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	while (x.hasMoreTokens()) {
		int n=x.nextInt();
		int[]costs=new int[n];
		int y=0;
	while(n-->0){
	costs[y]=x.nextInt();
	y++;
}
	
	long m=x.nextLong();
	Arrays.sort(costs);
	int i=0;
	int j=costs.length-1;
	int min = 0;
	int max=0;
	while(j>i){
		if(costs[i]+costs[j]>m){
			j--;
		}
		else if(costs[i]+costs[j]<m){
			i++;
		}
		else{
				min=costs[i];
				max=costs[j];
			i++;
			j--;
			
		}
		
	} 
	System.out.printf("Peter should buy books whose prices are %d and %d.\n\n",min,max );
	}
	}
	static class Scanner {
		private BufferedReader reader;
		private StringTokenizer st;
 
		public Scanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			st = null;
		}
 
		public String next() {
			tok();
			return st.nextToken();
		}
 
		boolean hasMoreTokens() {
			if (st != null && st.hasMoreTokens())
				return true;
			tok();
			if (st != null)
				return st.hasMoreTokens();
			return false;
		}
 
		private void tok() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null)
						return;
					st = new StringTokenizer(line);
				} catch (Exception e) {
					throw (new RuntimeException());
				}
			}
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


