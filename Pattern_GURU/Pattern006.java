import java.util.*;

class Pat006{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int count=1;
		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){
				System.out.print("  ");
			}
			
			for(int k=1;k<=2*i-1;k++){
				if(n<=k){
					System.out.print(count);
					count++;
				}else{
					count--;
					System.out.print(count);
				}
			}

			System.out.println();
		}
	}
}