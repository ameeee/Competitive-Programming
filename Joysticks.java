import java.util.*;
public class Joysticks {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int m=x.nextInt();
		int n=x.nextInt();
		int count=0;
		int temp;
		if(n<m){
			temp=n;
			n=m;
			m=temp;
		}
		if(n==1 && m==1)
			System.out.println(count);
		else{
	while(n>=0 && m>=0){
		n-=2;
		m+=1;
		if(n==1 || n==0){
			temp=n;
			n=m;
			m=temp;
		}
		if(n==0 && m==1 || n==1 && m==0){
			break;
		}
		if(n==1 && m==1)
			break;
		count++;
	}
	System.out.println(count);
	
		}
	}

}
