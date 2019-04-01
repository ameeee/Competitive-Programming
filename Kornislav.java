import java.util.*;
public class Kornislav {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int p[]=new int[4];
	for(int i=0;i<4;i++){
		p[i]=x.nextInt();
	}
	Arrays.sort(p);
	System.out.println(p[0]*p[2]);
	}

}
