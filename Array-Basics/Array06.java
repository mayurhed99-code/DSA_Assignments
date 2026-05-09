/*	### 6\. Print elements at even and odd indices 
 
**Problem:** Given an array of integers `nums`, print all elements located at even indices and all 
elements located at odd indices. 
 
  * **Input Example:** 
    ``` 
    [10, 20, 30, 40, 50] 
    ``` 
  * **Output Example:** 
    ``` 
    Elements at even indices: 10 30 50 
    Elements at odd indices: 20 40 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={10, 20, 30, 40, 50};

		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.toString(Demo.evenArr(arr)));
		System.out.println(Arrays.toString(Demo.oddArr(arr)));
	}

	static int[] evenArr(int []arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if((arr[i]/2)%2!=0) count++;
		}
		int evenArr[]=new int[count];

		int ind=0;
		for(int i=0;i<arr.length;i++){
	
			if((arr[i]/2)%2!=0){
				evenArr[ind]=arr[i];
				ind++;
			}
		}
		return evenArr;
	}

	static int[] oddArr(int []arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if((arr[i]/2)%2==0) count++;
		}
		int oddArr[]=new int[count];

		int ind=0;
		for(int i=0;i<arr.length;i++){
			if((arr[i]/2)%2==0){
				oddArr[ind]=arr[i];
				ind++;
			}
		}
		return oddArr;
	}
}