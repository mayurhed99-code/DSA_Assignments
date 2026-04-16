import java.util.*;

class Assig08_4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);			//compelet
		Assig08_4 obj = new Assig08_4();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" Element : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}


		int brut = obj.bruteForce(arr);
		int freq = obj.frequencyArray(arr);
		int hash = obj.hashmap(arr);

		System.out.println("Elements Appearing Only Once :");

		System.out.println("Brute Force :"+brut);
		System.out.println("Frequency array :"+freq);
		System.out.println("HashMap :"+hash);
	}

	int bruteForce(int arr[]){

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count == 1){
				return arr[i];		//Done by Loop
			}
		}

		return 0;
	}

	int frequencyArray(int arr[]){
		
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max < arr[i]){
				max=arr[i];
			}
		}

		int freq[] = new int[max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<freq.length;i++){		//Done by Frequency Array
			if(freq[i] == 1){
				return i;
			}
		}

		return 0;
	}

	int hashmap(int arr[]){
		
		HashMap<Integer,Integer>hm = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);	
		}

		for(int ans : hm.keySet()){
			if(hm.get(ans) == 1){			//Done by hashmap
				return ans;
			}
		}

		return 0;
	}
}



/*	Q4. Elements Appearing Only Once
Print all unique (non-repeating) elements
Example:
arr = [1,1,2,2,2,3]
→ Output: 3	*/