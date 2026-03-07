import java.util.*;

class GCD011{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();

		int GCD=1;
		for(int i=1;i<Math.min(a,b);i++){
			if(a%i==0 && b%i==0){
				GCD=i;	
			}
		}
		System.out.println(GCD);
		
	}
}


//Greatest common divisor 

//Time Complexity - O(min(a,b))
//Space Complexity - O(1)