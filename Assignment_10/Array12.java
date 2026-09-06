/*	
#### 12\. Check if the array is sorted (ascending order) 
 
**Problem:** Given an array of integers `nums`, return `true` if the array is sorted in ascending 
order, otherwise return `false`. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 3, 5] 
    ``` 
  * **Output Example:** 
    ``` 
    true 	*/

import java.util.*;

class Demo {
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 5};

		System.out.println(Arrays.toString(arr));

		System.out.println(Demo.checkSort(arr));
	}

	static boolean checkSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
}