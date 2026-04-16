import java.util.*;

class Assig08_9 {
	public static void main(String[] args){			//Done by efforts
		
		Scanner sc = new Scanner(System.in);
		Assig08_9 obj = new Assig08_9();

		System.out.println("Enter size for 1st and 2nd array \n 1st array size will be greater then 2nd array size : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int num1[] = new int[n1];
		int num2[] = new int[n2];

		System.out.println("Enter element for 1st array : ");
		for(int i=0;i<num1.length;i++){
			num1[i] = sc.nextInt();
		}

		System.out.println("Find Missing Elements Between Two Arrays : ");
		for(int i=0;i<num2.length;i++){
			num2[i] = sc.nextInt();
		}

		System.out.println("Brute Force : "+obj.bruteForce(num1, num2));
		System.out.println("Frequency Array : "+obj.frequencyArray(num1, num2));
		System.out.println("HashMap : "+obj.hashmap(num1, num2));
	}

	int bruteForce(int num1[], int num2[]){			//complete

		if(num1.length < num2.length){
			return -1;
		}

		for(int i=0;i<num1.length;i++){
			boolean found=false;
			for(int j=0;j<num2.length;j++){
				
				if(num1[i] == num2[j]){
					found=true;
					continue;
				}
			}

			if(!found){
				return num1[i];
			}
		}

		return -1;
	}

	int frequencyArray(int num1[], int num2[]){			//complete

		if(num1.length < num2.length){
			return -1;
		}

		int max=num1.length;
		int freq[] = new int[max+1];			//put num1 index and num2 ++ and 
								//traversal num1 find which is zer0.
		for(int i=0;i<num2.length;i++){
			freq[num2[i]]++;
		}

		for(int i=0;i<num1.length;i++){
			
			if(freq[num1[i]] == 0){
				return num1[i];
			}
		}

		return -1;
	}

	int hashmap(int num1[], int num2[]){			//complete		

		if(num1.length < num2.length){
			return -1;
		}					//made 2 hashmap and compair hm1 key contain hm2 key

		HashMap<Integer, Integer>hm1 = new HashMap<>();	

		for(int i=0;i<num1.length;i++){
			hm1.put(num1[i],hm1.getOrDefault(num1[i],0)+1);
		}

		HashMap<Integer, Integer>hm2 = new HashMap<>();

		for(int i=0;i<num2.length;i++){
			hm2.put(num2[i],hm2.getOrDefault(num2[i],0)+1);
		}

		for(Integer key : hm1.keySet()){
			
			if(!hm2.containsKey(key)){
				return key;
			}
		}
		
		return -1;
	}
}



/*	Q9. Find Missing Elements Between Two Arrays
Elements present in arr1 but missing in arr2
Example:
arr1 = [1,1,2,2,2,3,7] arr2 = [1,1,2,2,2,3]
→ Output: 7	*/