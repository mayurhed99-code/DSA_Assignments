/*	### 15\. Left rotate array by 1 position 
 
**Problem:** Given an array of integers `nums`, rotate the array to the left by one position. The 
first element should move to the end of the array. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 3, 4, 5] 
    ``` 
  * **Output Example:** 
    ``` 
    [2, 3, 4, 5, 1]	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 4, 5};

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(Demo.roteteArr(arr)));
	}

	static int[] roteteArr(int []arr){
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[0]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
}