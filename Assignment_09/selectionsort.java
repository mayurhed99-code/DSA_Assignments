import java.util.Arrays;

class Demo {
	public static void main(String[] args){			//selection_Sort
		
		int[] arr = {18,22,20,19,21};

		System.out.println(Arrays.toString(arr));	
								//find the minimum ele. and 
								//sort(1st index then 2nd and so on..)  
		int sortArr[] = Demo.selectionSort(arr);

		System.out.println("selection_Sort : "+Arrays.toString(sortArr));
	}

	static int[] selectionSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){		//Time Complexity-> O(n*n)
									//Space Complexity-> O(1)
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		return arr;
	}
}