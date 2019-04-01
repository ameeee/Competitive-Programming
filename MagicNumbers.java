import java.util.Arrays;
import java.util.Scanner;




public class MagicNumbers {
static String f;
static String m;
static boolean vis[];
static long n;
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		 n=x.nextLong();
		
		for (int i = 0; i < n; i++) {
	      
			long k=x.nextLong();
			long max=(long)9876543210L/k;
			  vis=new boolean[11];
	
			 for(long p=1;p<=max;p++){
	                 
				 if(findmagic(p) && findmagic(p*k))
	                	System.out.println(k*p+" / "+(p)+" = "+k);
	                }
			if(i!=n-1)
			 System.out.println();
		}
		
		}
		
		
		

 static boolean findmagic(long n) {
	 Arrays.fill(vis, false);
	 while(n!=0){
		 int r=(int) (n%10);
		 
		 if(vis[r]==true)
			return false;
		
         vis[r]=true;
        
         n/=10;
     }
     return true;
 }

}
