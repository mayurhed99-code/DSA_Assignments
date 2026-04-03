import java.util.*;

class Assign07_8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_8 obj=new Assign07_8();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int count = arr[0];
		int ans = obj.findMinimum(arr, 0, count);

		System.out.println("This is Smaller no. "+ans);
	}

	int findMinimum(int arr[], int index, int count){
		
		if(index == arr.length){
			return count;
		}

		if(count > arr[index]){
			count = arr[index];
		}

		return findMinimum(arr, index+1, count);

	}


}



/*	Q8. Find Minimum Element
👉 Return minimum value
Input: [3,9,1,7]
Output: 1	*/