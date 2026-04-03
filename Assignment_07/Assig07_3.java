import java.util.*;

class Assign07_3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_3 obj=new Assign07_3();

		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elements in the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Target number : ");
		int trg=sc.nextInt();
		
		int count=0;
		
		int ans=obj.countOccurrence(arr, trg, 0, count);

		System.out.println("The Answer: "+ans);
	}


	int countOccurrence(int arr[], int trg, int index, int count){
		
		if(index == arr.length){
			return count;
		}

		if(arr[index] == trg){
			count++;
		}

		return countOccurrence(arr, trg, index+1, count);
	}
}