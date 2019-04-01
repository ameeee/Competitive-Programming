import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class JohnnyTheGamblerAvoidingCompl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		try{BufferedReader input = new BufferedReader(new InputStreamReader(System.in));		
		int t = Integer.parseInt(input.readLine());
		Scanner x=new Scanner(System.in);
	for (int i=0;i<t;i++){
		String[] arrayData = input.readLine().split(" ");
		int[] cardsi = new int[arrayData.length];
		int []cards2=new int[arrayData.length-2];
		int e=0;
		for(int a =0;a<arrayData.length;a ++){
			cardsi[e] = Integer.parseInt(arrayData[a]);
			if (cardsi[e]>1000){
				cardsi[e]=x.nextInt();
			}
			e++;
		}
		int f=0;
		for(int a =2;a<arrayData.length;a ++){
			cards2[f] = Integer.parseInt(arrayData[a]);
			f++;
		}
		
		long X=cardsi[0];
		int g=twoSum(cards2,X);
		System.out.println((i+1)+". "+g);
	}
	}
		catch(IOException e){
			return;
		}
	}
		public static int twoSum(int[] nums, long target) {
		 
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		    int count=0;
		    for(int i=0; i<nums.length; i++){
		        if(map.containsKey(nums[i])){
		        	 count++;
		           
		        }else{
		            map.put ((int) (target-nums[i]), i);
		        }
		    }
		 
		    return count;
		}

	

}

