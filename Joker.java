import java.util.ArrayList;
import java.util.Scanner;


public class Joker {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		int d=x.nextInt();
		int sum=0;
		int count=0;
		for (int i = 0; i < t; i++) {
			if(i==t-1)
				sum+=x.nextInt();
			else{
			sum+=x.nextInt()+10;
			count+=2;
			}
		}
		int diff=d-sum;
		if(diff>0){
			while(diff>0){
				diff=diff-5;
				if(diff>=0)
				count++;
			}
			System.out.println(count);
				
		}
		else if(diff<0){
			System.out.println(-1);
		}
		else{
			System.out.println(count);
		}

	}

}
