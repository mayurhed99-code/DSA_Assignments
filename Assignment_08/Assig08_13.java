import java.util.*;
import java.util.HashMap;
import java.util.Arrays;

class Assig08_13 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Assig08_13 obj=new Assig08_13();

		System.out.println("Enter size :");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter element :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int arr1[]=arr.clone();			//clone array

		System.out.println("Brute Force :");
		obj.bruteForce(arr);
		System.out.println("Frequency Array :");
		obj.frequencyArray(arr);
		System.out.println("HashMap :");
		obj.hashmap(arr1);
	}

	void bruteForce(int arr[]){

		System.out.println(Arrays.toString(arr));

		int newArr[]=new int[arr.length];		//new array

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){		//by nested loops
				if(arr[i] == arr[j]){
					count++;
				}
			}

			newArr[i]=count;
		}

		System.out.println(Arrays.toString(newArr));
	}

	void frequencyArray(int arr[]){

		System.out.println(Arrays.toString(arr));		//complete

		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}

		int freq[]=new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<arr.length;i++){
			arr[i]=freq[arr[i]];
		}

		System.out.println(Arrays.toString(arr));
	}

	void hashmap(int arr1[]){

		System.out.println(Arrays.toString(arr1));		//complete

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0;i<arr1.length;i++){
			hm.put(arr1[i], hm.getOrDefault(arr1[i],0)+1 );
		}

		for(int i=0;i<arr1.length;i++){
			arr1[i]=hm.get(arr1[i]);
		}

		System.out.println(Arrays.toString(arr1));
	}
}



/*	Q13. Replace Elements with Frequency
 Convert:
[1,2,2,3]
→ [1,2,2,1]	*/