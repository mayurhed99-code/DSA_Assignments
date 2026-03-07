import java.util.*;

class Divisor07{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i == 0){
				System.out.println("Pair of divisor : ("+i+","+n/i+")");
			}
		}
	}
}

//Divisor pairs

//Time Complexity - O(Math.sqrt(n))
//Space Complexity - O(1)