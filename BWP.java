import java.util.*;
public class BWP {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int m=x.nextInt();
int pdct=n*m;
String chess[]=new String[pdct];
for (int i=0;i<pdct;i+=2){
	chess[i]="White";
	chess[i+1]="Black";
	}
System.out.println(chess[pdct-1]);
	}

}
