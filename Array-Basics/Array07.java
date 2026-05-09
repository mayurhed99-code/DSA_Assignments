/*	#### 7\. Calculate average of array elements 
 
**Problem:** Given an array of integers `nums`, calculate and print the average of its elements. 
 
  * **Input Example:** 
    ``` 
    [10, 20, 30] 
    ``` 
  * **Output Example:** 
    ``` 
    20.0 	*/

import java.util.*;

class Demo {
	public static void main(String[] args){
		
		int arr[]={10, 20, 30};

		System.out.println(Arrays.toString(arr));

		System.out.println(Demo.avgArr(arr));		
	}

	static double avgArr(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}

		return sum/arr.length;
	}
}