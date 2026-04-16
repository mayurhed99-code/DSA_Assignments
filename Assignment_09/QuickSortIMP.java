import java.util.Arrays;

class Demo {
	public static void main(String[] args){
		
		int[] arr = {75,85,55,95,65};
		
		System.out.println(Arrays.toString(arr));		//incomplete

		int low = 0, high = arr.length-1;
		
		Demo.function(arr, low, high);

		System.out.println(Arrays.toString(arr));
	}

	public static void function(int[] arr, int low, int high){
		
		if(low == high){
			return;
		}

		int pivot = Demo.pivotIndex(arr, low, high);

		Demo.function(arr, low, pivot-1);
		Demo.function(arr, pivot+1, high);

		
	}

	public static int pivotIndex(int arr[], int low, int high){
		
		int pivot = arr[low];
		int i = low;
		int j = high;

		while(i < j){
			while(i <= high && arr[i] <= pivot){
				i++;
			}

			while(j >= low && arr[i] > pivot){
				j--;
			}

			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[low];
		arr[low] = arr[j];
		arr[j]=temp;

		

		return j;
	}
}