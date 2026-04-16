import java.util.*;
import java.util.Arrays;

class Assig08_5 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		//complelet by bit of efforts
		Assig08_5 obj = new Assig08_5();

		System.out.println("Enter Size : ");
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter "+size+" element");
		for(int i=0;i<arr.length;i++){			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Remove Duplicates from Array :");

		int[] brut = obj.bruteForce(arr);
		System.out.println("Brute Force :"+Arrays.toString(brut));

		obj.frequencyArray(arr);
		obj.hashmap(arr);

	}

	int[] bruteForce(int arr[]){				//Done and return array here 
		
		int newArrsize=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count == 1){
				newArrsize++;
			}
		}

		int newArr[] = new int[newArrsize];
		int index=0;
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count == 1){
				newArr[index]=arr[i];
				index++;
			}
		}

		System.out.println();
		return newArr;
	}

	void frequencyArray(int arr[]){
		
		System.out.print("Frequency array :");			//Done not return just print elements 

		int Max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(Max < arr[i]){
				Max=arr[i];
			}
		}

		int freq[] = new int[Max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<freq.length;i++){
			if(freq[i] == 1){
				System.out.print(i+", ");
			}
		}

		System.out.println();
	}

	void hashmap(int arr[]){
		
		System.out.print("HashMap : ");
		HashMap<Integer, Integer>hm = new HashMap<>();			

		for(int i=0;i<arr.length;i++){				
			hm.put( arr[i], hm.getOrDefault( arr[i], 0)+1 );
		}

		for(int key : hm.keySet()){				//Done not return just print elements
			
			if(hm.get(key) == 1){
				System.out.print(key+", ");
			}
		}

		System.out.println();
	}
}



/*	Q5. Remove Duplicates from Array
Return array with only distinct elements
Example:
arr = [1,2,2,2,3]
→ Output: [1,3]		*/