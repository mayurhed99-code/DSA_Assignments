import java.util.*;

class Assig07_18{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Assig07_18 obj = new Assig07_18();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elements to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		boolean ans = obj.allElementUniqu(arr, 0);
		
		System.out.println("Check if All Elements are Unique : "+ans);
	}

	boolean allElementUniqu(int arr[], int index){
		
		if(index == arr.length){
			return true;
		}

		for(int i=index+1; i<arr.length-1; i++){
			if(arr[index] == arr[i]){
				return false;
			}
		}

		return allElementUniqu(arr, index+1);
	} 
}



/*	Q18. Check if All Elements are Unique
👉 Return true if no duplicates exist
Input: [1,2,3,4]
Output: true 	*/