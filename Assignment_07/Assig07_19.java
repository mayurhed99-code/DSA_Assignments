import java.util.*;

class Assig07_19{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Assig07_19 obj = new Assig07_19();

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elements to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		int ans = obj.sumDigitAllElement(arr, 0);
		
		System.out.println("The Sum of Digits of All Elements : "+ans);
	}

	int sumDigitAllElement(int arr[], int index){
		
		if(index == arr.length){
			return arr[arr.length-1];
		}

		int sum=0;
		while(arr[index] != 0){

			int temp=arr[index]%10;			//click by little bit of thinking 
			arr[index]=arr[index]/10;
			sum=sum+temp;
		}

		return sum + sumDigitAllElement(arr, index+1);
	}
}



/*	Q19. Find Sum of Digits of All Elements
👉 Each element is a number → sum all digits recursively
Input: [12, 34, 5]
output: 1+2+3+4+5 = 15		*/