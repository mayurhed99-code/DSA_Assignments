import java.util.*;

class Assig08_3 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		//complete
		Assig08_3 obj = new Assig08_3();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" Element : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Key K Frequency Elements :");
		int key = sc.nextInt();
		

		int brut = obj.bruteForce(arr,key);
		int freq = obj.frequencyArray(arr,key);
		int hash = obj.hashmap(arr,key);

		System.out.println("Print all elements whose frequency is greater than K :");

		System.out.println("Brute Force :"+brut);
		System.out.println("Frequency array :"+freq);
		System.out.println("HashMap :"+hash);
	}

	int bruteForce(int arr[], int key){

		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(key == count){
				return arr[i];			//Done by brute force
			}
		}

		return 0;
	}

	int frequencyArray(int arr[], int key){
		
		int max = 0;
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
			if(key == freq[i]){
				return i;
			}
		}

		return 0;
	}

	int hashmap(int arr[], int key){
		
		HashMap<Integer,Integer>hm = new HashMap<>();

		for(int i=0;i<arr.length;i++){

			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

		}

		for(int val : hm.keySet()){
			if(key == hm.get(val)){			//Done by hashmap
				return val;
			}
		}

		return 0;
	}
}




/*	Q3. Exactly K Frequency Elements
Print elements that appear exactly K times
Example:
arr = [1,1,2,2,2,3], K = 2
→ Output: 1	*/