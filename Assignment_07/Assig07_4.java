import java.util.*;

class Assign07_4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_4 obj=new Assign07_4();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean ans = obj.arrayisSorted(arr, 0);

		System.out.println("Array is "+ans+" Sorted");
	}

	boolean arrayisSorted(int arr[], int index){
		
		if(index == arr.length-1){
			return true;
		}

		if(arr[index] > arr[index+1]){
			return false;
		}

		return arrayisSorted(arr, index+1);

	}
}



/*	Q4. Check if Array is Sorted
👉 Return true if sorted in ascending order
Input: [1,2,3,4]
Output: true	*/