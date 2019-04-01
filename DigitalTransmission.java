import java.util.*;
public class DigitalTransmission {

	public static void main(String[] args) {
Scanner x=new Scanner(System.in);
String s=x.next();
boolean flag=false;
boolean flag2=false;
for (int i = 0; i < s.length(); i++) {
	if(s.charAt(i)=='.'){
		if(s.charAt(i-1)==s.charAt(i-2) &&i>=2){
			flag=true;
		}
		if(s.charAt(i+1)==s.charAt(i+2) && i<=s.length()-3){
			flag2=true;
		}
		if(flag==true && flag2==true){
			
		}
	}
}

	}

}
