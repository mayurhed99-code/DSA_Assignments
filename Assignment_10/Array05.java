/*	#### 5\. Count even and odd numbers in an array 
 
**Problem:** Given an array of integers `nums`, count and print the total number of even and 
odd elements. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 3, 4, 5, 6] 
    ``` 
  * **Output Example:** 
    ``` 
    Even count: 3 
    Odd count: 3 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 3, 4, 5, 6};

		System.out.println(Arrays.toString(arr));

		System.out.println("Even count : "+Demo.evenEle(arr));
		System.out.println("Odd count : "+Demo.oddEle(arr));
	}

	static int evenEle(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		return count;
	}

	static int oddEle(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				count++;
			}
		}
		return count;
	}
}