import java.util.*;

class Assig07_14{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig07_14 obj = new Assig07_14();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the then we find how many no. greater the this ");
		int x=sc.nextInt();

		boolean ans = obj.arrContainTrg(arr, 0, x);

		System.out.println("Check if Array Contains Target : "+ans);
	}

	boolean arrContainTrg(int arr[], int index, int x){
		
		if(index == arr.length){
			return false;
		}

		if(arr[index] == x){
			return true;
		}

		return arrContainTrg(arr, index+1, x);
	}
}




/*	Q14. Check if Array Contains Target
👉 Return true if target exists
Input: [1,2,3,4], target = 3
Output: true	*/