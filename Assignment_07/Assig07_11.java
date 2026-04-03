import java.util.*;


class Assign07_11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Assign07_11 obj=new Assign07_11();

		int size=sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int ans = obj.secondMaximum(arr, 0);

		System.out.println("The second largest: "+ans);
	}

	int secondMaximum(int arr[], int index){
		
		if(index == arr.length-1){
			return arr[arr.length-2];
		}

		for(int i=0;i<arr.length-1;i++){

			if(arr[i] > arr[i+1]){

				int temp = arr[i];
        			arr[i] = arr[i+1];
        			arr[i+1] = temp;
			}
		}

		return secondMaximum(arr, index+1);
	}
}


/*	Q11. Find Second Maximum
👉 Return second largest element
Input: [10,5,8,20,15]
Output: 15	*/