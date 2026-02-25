import java.util.*;

class Pattern009{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int k=1;k<=n;k++){
			for(int i=1;i<=n-k;i++){
				System.out.print("  ");
			}
			
			for(int j=1;j<=k;j++){
				System.out.print(j+" ");
			}

			for(int l=k-1;l>=1;l--){
				System.out.print(l+" ");
			}

			System.out.println();
		}
	}
}