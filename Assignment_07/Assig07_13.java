import java.util.*;

class Assign07_13{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		Assign07_13 obj=new Assign07_13();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the then we find how many no. greater the this ");
		int x=sc.nextInt();

		int count=0;
		int ans = obj.elementsGreatThnX(arr, 0, x, count);

		System.out.println("The No. of element greater then "+x+" : "+ans);
	}

	int elementsGreatThnX(int arr[], int index, int x, int count){
		
		if(index == arr.length){
			return count;
		}

		if(arr[index] > x){
			count++;
		}

		return elementsGreatThnX(arr, index+1, x, count);
	}
}




/*	Q13. Count Elements Greater Than X
👉 Return count of elements greater than given value
Input: arr = [1,5,3,7,2], x = 3
Output: 2	*/