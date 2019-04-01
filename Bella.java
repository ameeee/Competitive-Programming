import java.util.*;
public class Bella {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
int n=x.nextInt();
char s=x.next().toUpperCase().charAt(0);
char [] chars={'A','K','Q','J','T','9','8','7'};
int []dominant={11,4,3,20,10,14,0,0};
int []nondominant={11,4,3,2,10,0,0,0};
int sum=0;
for(int i=0;i<n*4;i++){
	String m=x.next();
	if(m.charAt(1)==s){
		for(int j=0;j<dominant.length;j++){
			if(m.charAt(0)==chars[j]){
				sum+=dominant[j];
			}
		}
	}
	else{
		for(int j=0;j<dominant.length;j++){
			if(m.charAt(0)==chars[j]){
				sum+=nondominant[j];
			}
		}
		
	}
}
System.out.println(sum);

	}

}
