import java.util.*;

class Armstrong06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int arm=0;
		int org=n;
		while(n != 0){
			int temp=n%10;
			arm=arm+temp*temp*temp;
			n=n/10;
		}

		if(arm == org){
			System.out.println("YES it is Armstrong no. ");
		}else{
			System.out.println("NO it is not Armstrong no. ");
		}
	}
}


//Armstrong check

//Time Complexity - O(log n)
//Space Complexity - O(1)