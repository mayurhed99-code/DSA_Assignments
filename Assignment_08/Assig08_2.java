import java.util.*;

class Assig08_2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);		//complete
		Assig08_2 obj = new Assig08_2();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" element in the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a no. :");
		int k = sc.nextInt();
		
		System.out.println("Print all elements whose frequency is greater than K :");

		obj.bruteForce(arr,k);
		obj.frequencyArray(arr,k);
		obj.hashmap(arr,k);

	}

	void bruteForce(int arr[], int k){

		System.out.print("Brute Force : ");			//complelte by effort
		for(int i=0;i<arr.length-1;i++){
			int count=0;
			for(int j=i;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
			}

			if(count > k){
				System.out.print(arr[i]+", ");
			}
		}

		System.out.println();
	}

	void frequencyArray(int arr[], int k){

		System.out.print("frequency Array : ");

		int Max=Integer.MIN_VALUE;				//complelte by little effort
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
			if(freq[i] == 0){
				continue;
			}

			if(freq[i] > k){
				System.out.print(i+", ");
			}
		}

		System.out.println();
	}

	void hashmap(int arr[], int k){
								//complelte easly not much effort
		System.out.print("HashMap : ");

		HashMap<Integer, Integer>hm = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			hm.put( arr[i], hm.getOrDefault(arr[i],0)+1 );
		}

		for(int key : hm.keySet()){
			
			if(hm.get(key) > k){
				System.out.print(key+", ");
			}
		}

		System.out.println();
	}
}



/*	Q2. Frequency Greater Than K
Print all elements whose frequency is greater than K
Example:
arr = [1,1,2,2,2,3], K = 2
→ Output: 2	*/