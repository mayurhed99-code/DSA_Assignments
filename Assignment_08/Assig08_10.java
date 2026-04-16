import java.util.*;
import java.util.Arrays;

class Assig08_10 {
	public static void main(String[] args){				//incomplete
		
		Scanner sc = new Scanner(System.in);
		Assig08_10 obj = new Assig08_10();

		System.out.println("Enter the size of 1st array : ");
		int n = sc.nextInt();
		int nums1[] = new int[n];
		
		System.out.println("Enter Elements :");
		for(int i=0;i<nums1.length;i++){
			nums1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of 2nd array : ");
		int m = sc.nextInt();
		int nums2[] = new int[m];
		
		System.out.println("Enter Elements :");
		for(int i=0;i<nums2.length;i++){
			nums2[i] = sc.nextInt();
		}

		System.out.println("Find Common Elements With Frequency : ");

		obj.bruteForce(nums1, nums2);
		obj.frequencyArray(nums1, nums2);
		obj.hashmap(nums1, nums2);
	}

	void bruteForce(int nums1[], int nums2[]){ 			//complete

		int maxcount=Integer.MIN_VALUE;
		for(int i=0;i<nums1.length;i++){
			int count=0;
			for(int j=0;j<nums2.length;j++){
				
				if(nums1[i] == nums2[j]){
					count++;
				}
			}

			if(maxcount < count ){
				maxcount=count;
			}
		}

		int ansArr[]=new int[maxcount];
		int index=0;
		for(int i=0;i<nums1.length;i++){
			int count=0;
			for(int j=0;j<nums2.length;j++){

				if(nums1[i] == nums2[j]){
					count++;
				}
			}

			if(ansArr.length == count){
				ansArr[index]=nums1[i];
			}
		}

		System.out.println("Brute Force : "+Arrays.toString(ansArr));
	}

	void frequencyArray(int nums1[], int nums2[]){}

	void hashmap(int nums1[], int nums2[]){}
}



/*	Q10. Find Common Elements (With Frequency)
Intersection of two arrays
Example:
[1,2,2,3] & [2,2,4]
→ Output: [2,2]		*/

