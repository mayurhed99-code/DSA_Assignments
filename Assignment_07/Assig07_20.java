import java.util.*;

class Assig07_20{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Assig07_20 obj = new Assig07_20();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elements to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		boolean ans = obj.arrayStrictlyDecreasing(arr, 0);
		
		System.out.println("Check if Array is Strictly Decreasing : "+ans);
	}

	boolean arrayStrictlyDecreasing(int arr[], int index){

		if(index == arr.length-1){
			return true;
		}

		if(arr[index] < arr[index+1]){
			return false;
		}

		return arrayStrictlyDecreasing(arr, index+1);
	}
}




/*	Q20. Check if Array is Strictly Decreasing
👉 Return true if strictly decreasing
Input: [9,7,5,2]
Output: true	*/