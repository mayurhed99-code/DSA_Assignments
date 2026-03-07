import java.util.Scanner;

class PerfectNo014{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int PrfNo = 1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i == 0){
				PrfNo=PrfNo+i+n/i;	
			}
		}

		if(PrfNo == n){
			System.out.println("Perfect Number");
		}else{
			System.out.println("Not Perfect Number");
		}
	}
}

//check Perfect no.

//Time Complexity - O(sqrt(n))
//Space Complexity - O(1)