import java.util.*;

class Palindrome04{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int pal=n;
		int rev=0;
		while(n != 0){
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		
		if(pal == rev){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}


//Check Palindrome

//Time Complexity - O(log n)
//Space Complexity - O(1)