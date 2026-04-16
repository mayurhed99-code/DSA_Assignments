import java.util.Arrays;

class Demo{
	public static void main(String[] args){
		
		int []arr = {50,23,9,18,61,32};

		int low=0, high=arr.length-1;

		Demo.divideArr(arr, low, high);
	}

	public static void divideArr(int arr[], int low, int high){
		
		if(low >= high){
			return;
		}

		int mid = (low+high)/2;


		divideArr(arr, low, mid);		//this divide the array into 2 and 
							//it hold 1st divided part.	
		divideArr(arr, mid+1, high);		//this hold the 2nd divided part

		mergeSort(arr, low, mid, high);			//this merge the 2 sorted array
	}

	public static void mergeSort(int arr[], int low, int mid, int high){		
		
		int finalArr[] = new int[high - low + 1];

		int p1=low, p2=mid+1, fnlp=0;

		while(p1<=mid && p2<=high){
			if(arr[p1] <= arr[p2]){
				finalArr[fnlp] = arr[p1];
				p1++;
				fnlp++;
			}else{
				finalArr[fnlp] = arr[p2];
				p2++;
				fnlp++;
			}
		}

		while(p1 <= mid){
			finalArr[fnlp] = arr[p1];
			p1++;
			fnlp++;
		}

		while(p2 <= high){
			finalArr[fnlp] = arr[p2];
			p2++;
			fnlp++;
		}

		

		for(int i=0; i<finalArr.length; i++){
			arr[low+i] = finalArr[i];
		}

		System.out.println(Arrays.toString(finalArr));
	}
}