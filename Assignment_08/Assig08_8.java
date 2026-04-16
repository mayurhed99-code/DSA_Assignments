import java.util.*;

class Assig08_8 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);		//complete just a bruteforce is incompelet
		Assig08_8 obj = new Assig08_8();

		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		System.out.println("Check If String is Pangram Contains all characters a–z :");

		System.out.println("Brute Force : "+obj.bruteForce(str));
		System.out.println("Frequency array : "+obj.frequencyArray(str));
		System.out.println("HashMap : "+obj.hashmap(str));
	}

	boolean bruteForce(String str){					//this is incomplete

		for(int i=0;i<26;i++){
			for(int j=0;j<str.length();j++){
				
				if((char)(i+'a') != str.charAt(i)){
					return false;
				}
			}
		}

		return true;
	}

	boolean frequencyArray(String str){			//complete by alphabet freqency array

		int freq[] = new int[26];
		for(int i=0;i<str.length();i++){

			freq[str.charAt(i)-'a']++;
		}

		for(int i=0;i<freq.length;i++){
			if(freq[i] == 0){
				return false;
			}
		}

		return true;
	}

	boolean hashmap(String str){			//complete by checking hashmap size is 26 or not

		HashMap<Character, Boolean>hm = new HashMap<>();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				hm.put(ch, true);
			}
		}

		if(hm.size() == 26){
			return true;
		}

		return false;
	}
}


/*	8. Check If String is Pangram
Contains all characters a–z
Example:
String str = “thequickbrownfoxjumpsoverthelazydog”
→ Output: true		*/