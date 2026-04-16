import java.util.*;
import java.util.HashMap;

class Assig08_7 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig08_7 obj = new Assig08_7();

		System.out.println("Enter Size : ");
		int size=sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter "+size+" element");
		for(int i=0;i<arr.length;i++){				//Compelet
			arr[i] = sc.nextInt();
		}
		
		
		int brut = obj.bruteForce(arr);
		int freq = obj.frequencyArray(arr);
		int hash = obj.hashmap(arr);

		System.out.println("Second Least Frequent Element in an Array :");

		System.out.println("Brute Force :"+brut);
		System.out.println("Frequency array :"+freq);
		System.out.println("HashMap :"+hash);
	}

	int bruteForce(int arr[]){
		
		int small=Integer.MAX_VALUE;
		int first=-1;
		int second=-1;					//Done by loops 

		for(int i=0;i<arr.length;i++){
			int count=0;				//by first and second
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count < small){
				small=count;
				second=first;
				first=arr[i];
			}
		}

		return second;
	}

	int frequencyArray(int arr[]){				//Done by Frequency Array
		
		int max=0;
		for(int i=0;i<arr.length;i++){			//Done by lote of effort
			if(max < arr[i]){
				max=arr[i];			//by store first smallest and second smallest
			}
		}

		int freq[] = new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		int first = Integer.MAX_VALUE;			//remember this is key things
		int second = Integer.MAX_VALUE;

		int firstIndex = -1;
		int secondIndex = -1;

		for(int i=0;i<freq.length;i++){

			if(freq[i] == 0){
				continue;
			}

			if(first > freq[i]){
				secondIndex=firstIndex;
				firstIndex=i;
				
				second=first;
				first=freq[i];
			}else if(second > freq[i]) {
				secondIndex=i;

				second=freq[i];
			}
		}

		return secondIndex;
	}

	int hashmap(int arr[]){
		
		HashMap<Integer,Integer>hm = new HashMap<>();			//hashmap Done

		for(int i=0;i<arr.length;i++){
			hm.put(arr[i], hm.getOrDefault( arr[i],0 )+1 );
		}

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int firstKey = -1;
		int secKey = -1;
		
		for(int key : hm.keySet()){
			
			if(hm.get(key) < first){

				secKey = firstKey;
				firstKey = key;

				second = first;
				first = hm.get(key);

			}else if(hm.get(key) < second){

				second = hm.get(key);
				secKey = key;
			}
		}

		return secKey;
	}
}



/*	Q7. Second Least Frequent Element in an Array
Return second least frequent element in an array
Example:
arr = [1,1,2,2,2,3]
→ Output: 1	*/