import java.util.*;

class Assign07_7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_7 obj=new Assign07_7();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int count = arr[0];
		int ans = obj.findMaximum(arr, 0, count);

		System.out.println("This is greater no. "+ans);
	}

	int findMaximum(int arr[], int index, int count){
		
		if(index == arr.length){
			return count;
		}

		if(count < arr[index]){
			count = arr[index];
		}

		return findMaximum(arr, index+1, count);

	}


}


/*	Q7. Find Maximum Element
👉 Return maximum value in array
Input: [3,9,1,7]
Output: 9	*/