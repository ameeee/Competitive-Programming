import java.util.Arrays;
import java.util.Scanner;


public class TourDeFrance {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int f;
	while((f=x.nextInt())!=0){
	int r=x.nextInt();
	double front[]=new double[f];
	for (int i = 0; i < f; i++) {
		front[i]=x.nextDouble();
		
	}
	double p[]=new double[r];
	for (int i = 0; i <r; i++) {
		p[i]=x.nextDouble();
	}
	Arrays.sort(p);
	double s[]=new double[r*f];
	double max=Integer.MIN_VALUE;
	int k=0;
	for(int j=0;j<front.length;j++){
	for (int i = 0; i < p.length; i++) {
		s[k]=p[i]/front[j];
		k++;
	}
	}
	Arrays.sort(s);

	for (int i = 0; i < s.length-1; i++) {
		if(s[i+1]/s[i]>max){
			max=s[i+1]/s[i];
		}
		
	}
	
	System.out.printf("%.2f",max);
	System.out.println();
	}

}
}
