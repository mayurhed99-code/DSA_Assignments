import java.util.*;

class PrimeUptoN010{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int j;
		for(int i=1;i<n;i++){
			for(j=2;j<i;j++){
				if(i%j == 0){
					break;
				}
			}

			if(i == j){
				System.out.println("Prime numbers : "+i);
			}
		}
	}
}


//Print Prime Number up to n

//Time Complexity - O(n*n)
//Space Complexity - O(1)