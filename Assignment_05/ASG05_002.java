import java.util.*;

class DigExt02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		while(n != 0){
			int temp=n%10;
			System.out.println(temp);
			n=n/10;			
		}
	}
}


//Extract all digits

//Time Complexity - O(log n)
//Space Complexity - O(1)