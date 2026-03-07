import java.util.*;

class CountDivisor08{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				System.out.println(i);
				count++;
			}
		}

		System.out.println("Number of Divisor : "+count);
	}
}


//Number of Divisor

//Time Complexity - O(n)
//Space Complexity - O(1)