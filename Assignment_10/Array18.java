/*	#### 18\. Rotate array by k positions (left/right) 
 
**Problem:** Given an array of integers `nums` and an integer `k`, rotate the array to the left by 
`k` positions. 
 
  * **Input Example:** 
    ``` 
    nums = [1, 2, 3, 4, 5], k = 2 
    ``` 
  * **Output Example:** 
    ``` 
    [3, 4, 5, 1, 2]	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 4, 5};
		int k=3;

		System.out.println(Arrays.toString(arr)+" Rotate by "+k);
	
		Demo.reversFunction(arr, 0, k-1);
		Demo.reversFunction(arr, k, arr.length-1);
		Demo.reversFunction(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
	
	public static void reversFunction(int arr[], int i, int j){
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}		
	}
}