import java.util.*;
import java.util.HashMap;

class Assig08_6 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);		//complete
		Assig08_6 obj = new Assig08_6();

		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		
		char brut = obj.bruteForce(str);
		char freq = obj.frequencyArray(str);
		char hash = obj.hashmap(str);

		System.out.println("Most Frequent Character in String :");

		System.out.println("Brute Force :"+brut);
		System.out.println("Frequency array :"+freq);
		System.out.println("HashMap :"+hash);
	}

	char bruteForce(String str){
		
		int maxfreq = -1;
		char ans=' ';
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=0;j<str.length();j++){
				
				if(str.charAt(i) == str.charAt(j)){
					count++;
				}
			}

			if(maxfreq < count){
				maxfreq = count;
				ans = str.charAt(i);		//Done by loops
			}
		}

		return ans;
	}

	char frequencyArray(String str){
		
		int freq[] = new int[26];
		for(int i=0;i<str.length();i++){

			freq[str.charAt(i) - 'a']++;
		}

		int max=0;
		char ans=' ';
		for(int i=0;i<str.length();i++){
			
			if(freq[str.charAt(i) - 'a'] > max){		//Done by Frequency array

				max=freq[str.charAt(i) - 'a'];
				ans=str.charAt(i);
			}
		}

		return ans;
	}

	char hashmap(String str){
		
		HashMap<Character,Integer>hm = new HashMap<>();

		for(int i=0;i<str.length();i++){
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0)+1);
		}

		int max=0;
		char ans=' ';
		for(char key : hm.keySet()){			//Done by hashmap
			
			if(hm.get(key) > max){
				max = hm.get(key);
				ans =key;
			}
		}

		return ans;
	}
}



/*	Q6. Most Frequent Character in String
Return most frequent character in the string
Example:
String str = “apple”
→ Output: ‘p’		*/