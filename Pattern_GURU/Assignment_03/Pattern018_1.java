import java.util.*;

class Pattern018_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int row=2*n-1;
		int col=2*n-1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){

				int top=i-1;
				int bottom=2*n-1-i;
				int left=j-1;
				int right=2*n-1-j;
				
				// int smallest=Math.min( Math.min(top,bottom), Math.min(left,right) );
				
				System.out.print(n-Math.min( Math.min(top,bottom), Math.min(left,right))+" ");
			}

			System.out.println();
		}
	}
}

// concentric rectangular pattern
// spiral pattern