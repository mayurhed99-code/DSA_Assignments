import java.util.*;

class Pattern018_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		
		for(int i=1;i<=n;i++){
			int t1=n;
			for(int j=1;j<=i;j++){
				System.out.print(t1+" ");
				t1--;
			}



			System.out.println();
		}
	}
}