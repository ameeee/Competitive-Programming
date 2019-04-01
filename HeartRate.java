import java.util.*;
public class HeartRate {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
int n=x.nextInt();
for(int i=0;i<n;i++){
	double b=x.nextDouble();
	double p=x.nextDouble();
	double bpm=(60*b)/p;
	double ratio=60/p;
	double diff=bpm-ratio;
	System.out.printf("%.4f",diff);
	double diff22=bpm-diff;
	System.out.println();
	System.out.printf("%.4f",bpm);
	System.out.println();
	System.out.printf("%.4f",bpm+diff22);
	System.out.println();
}

	}

}
