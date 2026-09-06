/*	 
#### 20\. Find the missing number in 1 to n 
 
**Problem:** Given an array `nums` containing `n` distinct numbers taken from `0, 1, 2, ..., n`, 
find the single number that is missing. 
 
  * **Input Example:** 
    ``` 
    [3, 0, 1] 
    ``` 
  * **Output Example:** 
    ``` 
    2 
    ```	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int nums[]={9,6,4,2,3,5,7,0,1};

		System.out.println(Arrays.toString(nums));

		System.out.println(Demo.missingNumber(nums));
	}

	static int missingNumber(int nums[]){
		int n=nums.length;
		int sum_n=n*(n+1)/2;
		int sum_arr=0;
		for(int i=0;i<n;i++){
			sum_arr+=nums[i];
		}
		return sum_n-sum_arr;
	}
}