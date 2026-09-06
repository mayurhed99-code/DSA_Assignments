/*	#### 4\. Find the maximum and minimum element 
 
**Problem:** Given an array of integers `nums`, find and print the maximum and minimum 
elements in the array. 
 
  * **Input Example:** 
    ``` 
    [5, 8, 2, 10, 3] 
    ``` 
  * **Output Example:** 
    ``` 
    Maximum: 10 
    Minimum: 2 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={5, 8, 2, 10, 3};

		System.out.println(Arrays.toString(arr));

		System.out.println("Maximum : "+Demo.maxEle(arr));
		System.out.println("Minimum : "+Demo.minEle(arr));
	}

	static int maxEle(int arr[]){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}

	static int minEle(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}
}