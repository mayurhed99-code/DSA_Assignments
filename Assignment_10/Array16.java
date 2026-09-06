/*	#### 16\. Right rotate array by 1 position 
 
**Problem:** Given an array of integers `nums`, rotate the array to the right by one position. The 
last element should move to the beginning of the array. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 3, 4, 5] 
    ``` 
  * **Output Example:** 
    ``` 
    [5, 1, 2, 3, 4] 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 4, 5};

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(Demo.rotateArr(arr)));
	}

	static int[] rotateArr(int arr[]){
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		return arr;
		}
}