import java.util.*;

class Assign07_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_2 obj=new Assign07_2();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Target number : ");
		int trg=sc.nextInt();

		int ans=obj.lastOccurrence(arr, trg, 0);

		System.out.println("The Answer: "+ans);
	}

	int lastOccurrence(int arr[], int trg, int index){
		
		if(index == arr.length){
			return -1;
		}

		int right = lastOccurrence(arr, trg, index+1);

		if(right != -1){
			return right;
		}

		if(arr[index]==trg){
			return index;
		}

		return -1;
	}
}




/*  Q2. Find Last Occurrence
👉 Return index of last occurrence of target
Input: [5,2,3,2,4], target = 2
Output: 3	  */