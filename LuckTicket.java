import java.util.*;
public class LuckTicket {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		String s=x.next();
		long sum1=0;
		long sum2=0;
		char []k=s.toCharArray();
		ArrayList <Integer>b=new ArrayList<Integer>();
		for (int i = 0; i < k.length; i++) {
			int h=k[i]-'0';
			if(h==4 || h==7)
			b.add(h);
		}
		if(n==2 && b.size()==2){
			if(b.get(0)==b.get(1))
				System.out.println("YES");
			else
			System.out.println("NO");
		}
		else if(b.size()!=n){
			System.out.println("NO");
		}
		else {
			for (int i = 0; i < k.length/2; i++) {
				sum1+=b.get(i);
			}
			for (int i = k.length/2; i < k.length; i++) {
				sum2+=b.get(i);
			}
			if(sum1!=sum2){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
		
		

	}

}
