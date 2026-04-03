import java.util.*;

class Assig07_17{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig07_17 obj = new Assig07_17();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elements to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a no. : ");
		int k = sc.nextInt();

		int count = 0;
		int ans = obj.elementDivisibleK(arr, 0, k, count);
		
		System.out.println("The Elements Divisible by K : "+ans);
	}

	int elementDivisibleK(int arr[], int index, int k, int count){

		if(index == arr.length){
			return count;
		}

		if(k == 0){
			return 0;
		}

		if(arr[index] % k == 0){
			count++;
		}

		return elementDivisibleK(arr, index+1, k, count);		
	}
}





/*	Q17. Count Elements Divisible by K
👉 Return count of elements divisible by k
Input: [2,4,5,6,9], k = 2
Output: 3	*/