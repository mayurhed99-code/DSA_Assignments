import java.util.*;

class GCD013{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();

		while(a!=0 && b!=0){
			if(a>b){
				a=a%b;
			}else{
				b=b%a;
			}
		}

		if(a==1 || b==1){
			System.out.println("Co-prime");
		}else{
			System.out.println("Not Co-prime");
		}
		
	}
}


//Co-prime no. by using Greatest common divisor

//Time Complexity - O(log(min(a,b)))
//Space Complexity - O(1)