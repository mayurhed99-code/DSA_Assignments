/*	#### 19\. Remove duplicates from sorted array 
 
**Problem:** Given a sorted array `nums`, remove the duplicates in-place such that each unique 
element appears only once. Return the new length of the array. 
 
  * **Input Example:** 
    ``` 
    [1, 1, 2, 2, 3, 4] 
    ``` 
  * **Output Example:** 
    ``` 
    4 (The array becomes [1, 2, 3, 4] after modification) 	*/

import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int nums[]={1, 1, 2, 2, 3, 4};	//incompelet

		System.out.println(Arrays.toString(nums));

		System.out.println(Demo.UniqeEle(nums));
	}

	public static int UniqeEle(int []nums){
		
		HashSet<Integer> hs=new HashSet<>();

		for(int i=0;i<nums.length;i++){
			hs.add(nums[i]);
		}

		return hs.size();
	}
}