import java.util.*;

class Assig07_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assig07_1 obj=new Assig07_1();  //create object for passing value to the other method

		int size=sc.nextInt();  //size of array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elements in the array : ");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Target number : ");
		int trg=sc.nextInt();

		int ans=obj.firstOccurrence(arr,trg,0);

		System.out.println("The Answer: "+ans);
	}

	int firstOccurrence(int arr[],int trg,int index){

		if(index == arr.length){
			return -1;
		}

		if(arr[index] == trg){
			return index;
		}

		return firstOccurrence(arr,trg,index+1);
	}
}



/*   Q1. Find First Occurrence
👉 Return index of first occurrence of target
Input: arr = [5,2,3,2,4], target = 2
Output: 1	*/