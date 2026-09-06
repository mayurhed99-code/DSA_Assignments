/*	#### 14\. Find the kth largest and kth smallest element 
 
**Problem:** Given an array of integers `nums` and an integer `k`, find and print the kth largest 
and kth smallest elements in the array. 
 
  * **Input Example:** 
    ``` 
    nums = [3, 2, 1, 5, 6, 4], k = 2 
    ``` 
  * **Output Example:** 
    ``` 
    2nd largest: 5 
    2nd smallest: 2 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={3, 2, 1, 5, 6, 4};
		int k=3;

		System.out.println(Arrays.toString(arr));

		System.out.println("Second largest : "+Demo.seclargest(arr,k));
		System.out.println("Second smallest : "+Demo.secSmallest(arr,k));	
	}

	static int seclargest(int []arr,int k){
		
		Arrays.sort(arr);

		return arr[arr.length-k];
	}

	static int secSmallest(int []arr,int k){
		
		Arrays.sort(arr);

		return arr[k-1];
	}
}