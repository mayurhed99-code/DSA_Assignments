/*	#### 17\. Reverse an array in place 
 
**Problem:** Given an array of integers `nums`, reverse the array without using any extra space. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 3, 4] 
    ``` 
  * **Output Example:** 
    ``` 
    [4, 3, 2, 1]	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 4};

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(Demo.reversArr(arr)));
	}

	static int[] reversArr(int arr[]){
		int i=0;
		int j=arr.length-1;
		while(i<j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
}