/*	#### 9\. Count the frequency of each element 
 
**Problem:** Given an array of integers `nums`, count and print the frequency of each distinct 
element in the array. 
 
  * **Input Example:** 
    ``` 
    [1, 2, 2, 3, 1, 4, 2] 
    ``` 
  * **Output Example:** 
    ``` 
    1: 2 
    2: 3 
    3: 1 
    4: 1 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={1, 2, 2, 3, 1, 4, 2};

		System.out.println(Arrays.toString(arr));
		
		Demo.frequency(arr);
	}

	public static void frequency(int arr[]){
		
		TreeMap<Integer,Integer> tm=new TreeMap<>();

		for(int i=0;i<arr.length;i++){
			tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
		}

		System.out.println(tm);
	}
}