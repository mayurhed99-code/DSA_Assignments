import java.util.*;

class Assign07_5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_5 obj=new Assign07_5();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean ans = obj.allElementsEven(arr, 0);

		System.out.println("Array is "+ans+" Sorted");
	}

	boolean allElementsEven(int arr[], int index){
		
		if(index == arr.length){
			return true;
		}

		if(arr[index]%2 != 0){
			return false;
		}

		return allElementsEven(arr, index+1);

	}


}

/*	Q5. Check if All Elements are Even
👉 Return true if all elements are even
Input: [2,4,6]
Output: true    */