import java.util.*;

class Assign07_12{
	public static void  main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		Assign07_12 obj=new Assign07_12();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		boolean ans = obj.strictlyIncreasing(arr, 0);

		System.out.println("The Strictly Increasing: "+ans);	
	}

	boolean strictlyIncreasing(int arr[], int index){
		
		if(index == arr.length-1){
			return true;
		}

		if(arr[index] >= arr[index+1]){
			return false;
		}

		return strictlyIncreasing(arr, index+1);
	}
}



/*	Q12. Check Strictly Increasing
👉 Return true if strictly increasing (no equal allowed)
Input: [1,2,3,3]
Output: false	*/