import java.util.*;

class CheckPrime09{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		boolean found=false;
		for(int i=2;i<n;i++){
			if(n%i == 0){
				System.out.println("NOT Prime");
				found=true;
				break;
			}
		}

		if(found == false){
			System.out.println("YES Prime");
		}
	}
}



//Check Prime Number

//Time Complexity - O(n)
//Space Complexity - O(1)