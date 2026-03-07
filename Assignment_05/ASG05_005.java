import java.util.*;

class SumofDig05{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int sum=0;
		while(n != 0){
			int tem=n%10;
			sum=sum+tem;
			n=n/10;
		}

		System.out.println("Sum of the digits : "+sum);
	}
}


//Sum of the digits

//Time Complexity - O(log n)
//Space Complexity - O(1)