import java.util.*;

class Demo{
	public static void main(String[] args){
		
		int arr[]={2,2,3,1};
		System.out.println(Arrays.toString(arr));

		System.out.println("Third Maximum Number : "+ThrdmaxNo(arr));
	}

	public static int ThrdmaxNo(int [] arr){
		
		int m1=0,m2=0,m3=0;

		for(int i=0;i<arr.length;i++){
			if(m1<arr[i]){
				m3=m2;
				m2=m1;
				m1=arr[i];
			}else if(m1>=arr[i] && m2<arr[i]){
				m3=m2;
				m2=arr[i];
			}else{
				m3=arr[i];
			}
		}

		if(nums.length<=2) return m1;

		return m3;
	}
}



/*	1. Third Maximum Number
Given an integer array nums, return the third distinct maximum number in this array. If the third 
maximum does not exist, return the maximum number.

Example 1: 
Input: nums = [3,2,1] 
Output: 1 
Explanation: The first distinct maximum is 3. The second distinct maximum is 2. The third distinct 
maximum is 1.

Example 2: 
Input: nums = [1,2] 
Output: 2 
Explanation: The first distinct maximum is 2. The second distinct maximum is 1. The third distinct 
maximum does not exist, so the maximum (2) is returned instead.

Example 3: 
Input: nums = [2,2,3,1] 
Output: 1 
Explanation: The first distinct maximum is 3. The second distinct maximum is 2 (both 2's are 
counted together since they have the same value). The third distinct maximum is 1.

Constraints:
• 1 <= nums.length <= 10⁴
•-2³¹ <= nums[i] <= 2³¹ - 1	*/