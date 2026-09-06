/*	#### 13\. Find the second largest and second smallest element 
 
**Problem:** Given an array of integers `nums` with at least two elements, find and print the 
second largest and second smallest distinct elements. 
 
  * **Input Example:** 
    ``` 
    [5, 2, 8, 1, 9] 
    ``` 
  * **Output Example:** 
    ``` 
    Second largest: 8 
    Second smallest: 2 		*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={5, 2, 8, 1, 9};

		System.out.println(Arrays.toString(arr));

		System.out.println("Second largest : "+Demo.seclargest(arr));
		System.out.println("Second smallest : "+Demo.secSmallest(arr));	
	}

	static int seclargest(int []arr){
		
		Arrays.sort(arr);

		return arr[arr.length-2];
	}

	static int secSmallest(int []arr){
		
		Arrays.sort(arr);

		return arr[1];
	}
}