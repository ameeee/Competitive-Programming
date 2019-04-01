import java.util.Scanner;




public class CollectingBeapers {
static boolean vis[][];
static int b;
static int r;
static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int r=x.nextInt();
int c=x.nextInt();
vis=new boolean[r][c];
int x0=x.nextInt();
int y0=x.nextInt();
b=x.nextInt();

for (int i = 0; i < b; i++) {
	vis[x.nextInt()][x.nextInt()]=true;
}
System.out.println(findShortest(x0,y0,1,0));
	}

	
	private static int findShortest(int x0, int y0,int n,int p) {
	while(n!=b){
			if(vis[x0][y0]!=true && x0<r && y0<c){
				vis[x0][y0]=true;
			    findShortest(x0,y0+1,n,p+1);
			    findShortest(x0,y0-1,n,p+1);
			    findShortest(x0+1,y0,n,p+1);
			    findShortest(x0-1,y0,n,p+1);
			    vis[x0][y0]=false;
			}
			else if(x0<r && y0<c){
				n++;
				findShortest(x0,y0+1,n,p+1);
			    findShortest(x0,y0-1,n,p+1);
			    findShortest(x0+1,y0,n,p+1);
			    findShortest(x0-1,y0,n,p+1);
				
			}
			    
		}
	return p;
		
		
	}


}
