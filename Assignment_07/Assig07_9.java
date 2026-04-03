import java.util.*;

class Assign07_9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		Assign07_9 obj=new Assign07_9();

		int size=sc.nextInt();		//Size of the array

		int arr[]=new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

	
		int ans = obj.sumEleOddIndx(arr, 0);

		System.out.println("Sum of the odd index "+ans);
	}

	int sumEleOddIndx(int arr[], int index){
		
		if(index == arr.length){
			return 0;
		}

		if((index/2)*2 != index){

			int sum = ( arr[index] + sumEleOddIndx(arr, index+1) );
		}

		return sumEleOddIndx(arr, index+1);

	}


}



/*	Q9. Sum of Elements at Odd Index
👉 Return sum of elements at index 1,3,5...
Input: [10,20,30,40,50]
Output: 20 + 40 = 60	*/