import java.util.*;


class Assig08_1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig08_1 obj = new Assig08_1();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" element in the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		int brut = obj.bruteForce(arr);
		int freq = obj.frequencyArray(arr);
		int hash = obj.hashmap(arr);

		System.out.println("Second Highest Frequency Element :");

		System.out.println("Brute Force :"+brut);
		System.out.println("Frequency array :"+freq);
		System.out.println("HashMap :"+hash);	
	}

	int bruteForce(int arr[]){			
		int Max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		int firstEle=-1;
		int secondEle=-1;

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){			//compelet by loops
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count > Max){
				secMax=Max;
				Max=count;
				

				secondEle=firstEle;
				firstEle=arr[i];
			}else if(count>secMax && count<Max){
				secMax=count;
				secondEle=arr[i];
			}
		}

		return secondEle;
	}

	int frequencyArray(int arr[]){

		int max=0;				//Done by same first second and firstKey secondKey
		for(int i=0;i<arr.length;i++){			
			if(max < arr[i]){
				max=arr[i];
			}
		}

		int freq[] = new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		int firstEle = Integer.MIN_VALUE;
		int secondEle = Integer.MIN_VALUE;

		int firstIndex = -1;
		int secondIndex = -1;

		for(int i=0;i<freq.length;i++){

			if(freq[i] == 0){
				continue;
			}
			
			if(freq[i] > firstEle){
				secondEle=firstEle;
				firstEle=freq[i];
				
				secondIndex=firstIndex;
				firstIndex=i;	
			
			}else if(freq[i] > secondEle){
				
				secondEle=freq[i];
				secondIndex=i;
			}
		}

		return secondIndex;
	}

	int hashmap(int arr[]){

		HashMap<Integer,Integer>hm = new HashMap<>();			//Done by hashmap

		for(int i=0;i<arr.length;i++){
			hm.put( arr[i], hm.getOrDefault(arr[i],0)+1 );
		}

		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;					//first second value compair
		int firstKey=-1;					//and store there key in first second
		int secondKey=-1;

		for(int key : hm.keySet()){
			
			if(hm.get(key) > first){
				
				second=first;
				first=hm.get(key);

				secondKey=firstKey;
				firstKey=key;
			}else if(hm.get(key) > second){
				
				second=hm.get(key);
				secondKey=key;
			}
		}

		return secondKey;
	}
}



/*	Q1. Second Highest Frequency Element
Find element with second maximum frequency
Example:
[1,2,2,3,3,3,4,4]
→ Output: 2 or 4	*/