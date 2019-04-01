import java.math.BigInteger;
import java.util.Scanner;

public class AnotherCandies {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
int p=x.nextInt();


for(int t=0;t<p;t++)
{
    int o=x.nextInt();
    BigInteger sum= BigInteger.ZERO;
    for (int i=0;i<o;i++){
        sum= sum.add(x.nextBigInteger());
    }

    if(sum.mod(new BigInteger(""+o))== BigInteger.ZERO)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    
    
}
}


}