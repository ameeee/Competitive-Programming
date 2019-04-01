import java.util.*;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
int gunnar[]=new int[4];
int emma[]=new int[4];
for (int i=0;i<4;i++){
	gunnar[i]=x.nextInt();
}
for (int i=0;i<4;i++){
	emma[i]=x.nextInt();
}
int count=0;
int counte=0;
for (int i=0;i<4;i++){
	counte+=emma[i];
	count+=gunnar[i];
}

if(count>counte){
	System.out.println("Gunnar");
}
else if(count<counte){
	System.out.println("Emma");
}
else{
	System.out.println("Tie");
}

	
	}

}
