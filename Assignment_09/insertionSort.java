import java.util.Arrays;

class Demo {
	public static void main(String[] args){
		
		int[] arr = {18,22,20,19,21};			//Insertion_Sort
		
		System.out.println(Arrays.toString(arr));

		int[] sortArr = Demo.insertionSort(arr);

		System.out.println(Arrays.toString(sortArr));
	}

	static int[] insertionSort(int arr[]){
		
		for(int i=1;i<arr.length;i++){
			
			int currentEle = arr[i];		//Time Complexity-> best=O(n) || worst=O(n*n)
			int left = i-1;							//Space Complexity-> O(1)

			while(left >=0 && arr[left] > currentEle){	
				arr[left+1] = arr[left];
				left--;
			}

			arr[left+1] = currentEle;
		}

		return arr;
	}
}