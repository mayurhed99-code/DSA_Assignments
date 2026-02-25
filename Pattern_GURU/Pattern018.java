import java.util.*;

class Pattern018{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		System.out.println();

		int t2=n;
		for(int i=1;i<=n;i++){
			int t1=n;
			for(int j=1;j<=i;j++){
				System.out.print(t1+" ");
				t1--;
			}

			for(int k=1;k<=2*(n-i)-1;k++){
				System.out.print(t2+" ");
			}

			for(int l=1;l<=i;l++){
				if(n-i+l != 1){
					System.out.print(n-i+l+" ");
				}
			}

			t2--;

			System.out.println();
		}


		t2=2;
		for(int i=n-1;i>=1;i--){
			int t1=n;
			for(int j=1;j<=i;j++){
				System.out.print(t1+" ");
				t1--;
			}

			for(int k=1;k<=2*(n-i)-1;k++){
				System.out.print(t2+" ");
			} 

			for(int l=1;l<=i;l++){
				if(n-i+l != 1){
					System.out.print(n-i+l+" ");
				}
			}

			t2++;

			System.out.println();
		}
	}
}