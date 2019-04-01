import java.util.*;
public class LastFact {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
		int f=x.nextInt();
		int ans=fact(f);
	    String a=Integer.toString(ans);
	    char b=a.charAt(a.length()-1);
	    System.out.println(b);
	}
	}
	public static int fact(int n){
		if (n==0)
			return 1;
		else{
			return n*fact(n-1);
		}
	}

}
