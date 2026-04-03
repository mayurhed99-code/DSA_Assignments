import java.util.*;

class Assign07_6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_6 obj=new Assign07_6();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean ans = obj.checkNegative(arr, 0);

		System.out.println("Array is "+ans+" Negative");
	}

	boolean checkNegative(int arr[], int index){
		
		if(index == arr.length){
			return true;
		}

		if(arr[index] < 0){
			return false;
		}

		return checkNegative(arr, index+1);

	}


}






/*	Q6. Check if Any Element is Negative
👉 Return true if at least one negative exists
Input: [1,2,-3,4]
Output: true */