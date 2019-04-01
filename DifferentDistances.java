import java.util.*;
public class DifferentDistances {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	while (true){
		double n=x.nextDouble();
		if (n==0){
			break;
		}
		double p=x.nextDouble();
		double z=x.nextDouble();
		double s=x.nextDouble();
		double q=x.nextDouble();
		
		double distance=Math.pow(Math.pow(Math.abs(n-z),q)+Math.pow(Math.abs(p-s),q), 1/q);
		System.out.printf("%.10f\n",distance);
		
	}

	}

}
