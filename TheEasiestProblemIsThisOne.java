import java.util.*;
public class TheEasiestProblemIsThisOne {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
int n;
n=x.nextInt();
while(n!=0){
for(int p=11; p<1000000000; p++) {
	if(findSum(p*n) == findSum(n)) {
		System.out.println(p);
		break;
	}
}
n =x.nextInt();
}
	}

	public static int findSum(int s){
	int m=0;
	while(s!=0){
		m+=s%10;
		s=s/10;
	}
	return m;
	}
}