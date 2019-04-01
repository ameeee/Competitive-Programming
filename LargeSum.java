import java.util.Scanner;


public class LargeSum {
static int offset=0;
static int a=0;
static int b=0;
static char d[][];
static int c=3;

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
int t=x.nextInt();
for (int i = 0; i < t; i++) {
	offset=0;
	c=3;
	a=x.nextInt();
	 b=x.nextInt();
	int v=x.nextInt();
	d=new char[a][b];

	StringBuilder u=new StringBuilder();
	for (int j = 0; j < a; j++) {
		String s=x.next();
		u.append(s);
	}
	String h=u.toString();
	fill(h);
	System.out.println(a+ " "+b+" "+v);
	for (int j = 0; j < v; j++) {
		int w=x.nextInt();
		int q=x.nextInt();
		c=3;
		int count=(doit(d,w,q,d[w][q],1));
		System.out.println(count-2);
		
	}

	
}

	}
	
	public static void fill(String s){
		for (int i=0; i <a; i++) {
		    for (int j=0; j < b; j++) {
		        d[i][j] = s.charAt(offset);
		        offset++;
		       
		    }
		   
		}
	}
	public static int doit(char[][] im,int N,int M,char f,int p) {
		
		MainLoop:
		while(true){
		for (int i = N-p; i <=N+p; i++) {
		for (int j = M-p; j <=M+p; j++) {
			if(i<a && j<b && i>=0 && j>=0){
			if(im[i][j]!=f){
				break MainLoop;
			}
		}
			else{
				break MainLoop;
			}
		}
		}
		p++;
		c+=2;
				
			}
return c;
	}
}


