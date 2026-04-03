import java.util.*;

class Assig07_15{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Assig07_15 obj = new Assig07_15();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}


		int ans = obj.sumAllNegative(arr, 0);

		System.out.println("Sum of All Negative Numbers : "+ans);
	}

	int sumAllNegative(int arr[], int index){
		
		if(index == arr.length){
			return 0;
		}

		if(arr[index] < 0){
			return arr[index]+sumAllNegative(arr, index+1);
		}

		return sumAllNegative(arr, index+1);
	}
}




/*	Q15. Find Sum of All Negative Numbers
👉 Return sum of all negative elements
Input: [1,-2,3,-4,5]
Output: -6	*/