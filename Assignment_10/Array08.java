/*	#### 8\. Search for an element in array (Linear Search) 
 
**Problem:** Given an array of integers `nums` and a target integer `x`, find if `x` is present in 
the array. Return the index of `x` if found, otherwise return -1. 
 
  * **Input Example:** 
    ``` 
    nums = [10, 20, 30, 40], x = 30 
    ``` 
  * **Output Example:** 
    ``` 
    2 
    ``` 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={10, 20, 30, 40};
		int x=30;

		System.out.println(Arrays.toString(arr));

		System.out.println(Demo.linearSearch(arr,x));
	}

	static int linearSearch(int arr[], int x){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x) return i;
		}
		return -1;
	}
}