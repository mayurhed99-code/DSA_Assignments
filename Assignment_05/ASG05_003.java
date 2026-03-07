import java.util.*;

class DigExt03{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int rev=0;
		while(n != 0){
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}

		System.out.println("Reverse of the Number : "+rev);
	}
}

//Reverse of the Number

//Time Complexity - O(log n)
//Space Complexity - O(1)