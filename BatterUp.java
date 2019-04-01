import java.util.*;
public class BatterUp {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
int n=x.nextInt();
int c=0;
double sum=0;
for (int i=0;i<n;i++){
	int p=x.nextInt();
	if (p!=(-1)){
		sum+=p;
		c++;
	}
	
}
double average=sum/c;
System.out.println(average);

	}

}
