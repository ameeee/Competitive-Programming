import java.util.*;
public class BearAndRasp {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int c=x.nextInt();
		int p[]=new int[n];
		for (int i = 0; i < n; i++) {
			p[i]=x.nextInt();
			
		}
		ArrayList<Integer> re=new ArrayList<Integer>();
		int max=p[0];
		int postmax=p[1];
		re.add(max-postmax-c);
		for (int i = 0; i < p.length; i++) {
			if(i!=p.length-1){
				max=p[i];
				postmax=p[i+1];
				re.add(max-postmax-c);
			}
		
		}
		Collections.sort(re);
		if(re.get(re.size()-1)<0){
			System.out.println(0);
		}
		else{
		System.out.println(re.get(re.size()-1));
		}
		

	}

}
