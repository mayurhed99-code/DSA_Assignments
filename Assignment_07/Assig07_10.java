import java.util.*;

class Assign07_10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Assign07_10 obj=new Assign07_10();
		
		int size=sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter "+size+" elemnts to the array :");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

	
		boolean ans = obj.checkPalindrome(arr, 0);

		System.out.println("The Array is Palindrome: "+ans);

	}	

	boolean checkPalindrome(int arr[], int index){
		
		if(index >= (arr.length/2)){
			return true;
		}

		if(arr[index] != arr[arr.length-1-index]){
			return false;
		}

		return checkPalindrome(arr, index+1);
	}
}