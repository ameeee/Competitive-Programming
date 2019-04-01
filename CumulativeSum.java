import java.util.Scanner;


public class CumulativeSum {
public static int []list;
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int N=x.nextInt();
	list=new int[N];
	for (int i = 0; i < N; i++) {
		list[i]=x.nextInt();
	}
	int Q=x.nextInt();
	while(Q-->0){
		int i=x.nextInt();
		int j=x.nextInt();
		System.out.println(findSum(i,j));
	}
	

	}
	public static int findSum(int i,int j){
		int sum=0;
		if(i==j){
			return list[i];
		}
		else{
			for (int j2 = i; j2 <=j; j2++) {
				sum+=list[j2];
			}
			return sum;
		}
		
	}

}
