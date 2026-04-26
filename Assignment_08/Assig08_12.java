import java.util.*;
import java.util.HashMap;

class Assig08_12{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Assig08_12 obj=new Assig08_12();

		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter element :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Brute Force :");
		obj.bruteForce(arr);
		System.out.println("Frequency Array :");
		obj.frequencyArray(arr);
		System.out.println("HashMap :");
		obj.hashmap(arr);
	}

	void bruteForce(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){ 
					count++; 
				}
			}

			System.out.print("Frequency "+count+" :"+arr[i]);
			System.out.println();
		}
		System.out.println();
	}

	void frequencyArray(int arr[]){
		
		int max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}

		int freq[]=new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println("Frequency "+freq[arr[i]]+" : "+arr[i]);
		}
		System.out.println();
	}

	void hashmap(int arr[]){
		
		HashMap<Integer,Integer>hm=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}

		for(int key : hm.keySet()){
			System.out.println("Frequency "+hm.get(key)+": "+key);
		}
		System.out.println();
	}
}



/*	Q12. Group Numbers by Frequency
Output format:
Frequency 1 → [3,5]
Frequency 2 → [1,2]	*/