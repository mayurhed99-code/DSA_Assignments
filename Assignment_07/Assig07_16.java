import java.util.*;

class Assig07_16{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig07_16 obj = new Assig07_16();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}


		int sml=arr[0];
		int inx= -1;
		int ans = obj.indexSmallEle(arr, 0, sml,inx);

		System.out.println("Index of the smallest element : "+ans);
	}

	int indexSmallEle(int arr[], int index, int sml,int inx){
		
		if(index == arr.length){
			return inx;
		}

		if(arr[index] < sml){
			sml = arr[index];
			inx = index;
		}

		return indexSmallEle(arr, index+1, sml,inx);
	}
}



/*	Q16. Find Index of Smallest Element
👉 Return index of minimum element
Input: [5,2,8,1,3]
Output: 3	*/