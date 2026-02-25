import java.util.*;

class Pattern004{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		char first;
		char sec;

		for(int i=1;i<=n;i++){
			if(i%2 != 0){
				first='*';
				sec='#';
			}else{
				first='#';
				sec='*';
			}

			for(int j=1;j<=n;j++){
				if(j%2 != 0){
					System.out.print(first);
				}else{
					System.out.print(sec);
				}
			}
			System.out.println();
		}
	}
}