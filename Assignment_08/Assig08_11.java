import java.util.*;
import java.util.HashMap;

class Assig08_11 {
	public static void main(String[] args){			//complete by efforts
		
		Scanner sc=new Scanner(System.in);
		Assig08_11 obj=new Assig08_11();

		String str1=sc.nextLine();
		String str2=sc.nextLine();

		System.out.println("Brute Force : "+obj.bruteForce(str1,str2));
		System.out.println("Frequency Array : "+obj.frequencyArray(str1,str2));
		System.out.println("HashMap : "+obj.hashmap(str1,str2));
	}

	boolean bruteForce(String str1, String str2){

		if(str1.length() != str2.length()){		
			return false;			//if str1 and str2 length is not
		}					//same then return false
		
		for(int i=0;i<str1.length();i++){
			int count=0;
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i) == str2.charAt(j)){
					count++;
				}
			}

			if(count == 0){
				return false;
			}
		}

		return true;
	}

	boolean frequencyArray(String str1, String str2){

		if(str1.length() != str2.length()){
			return false;
		}
		
		int freq[]=new int[26];

		for(int i=0;i<str1.length();i++){
			freq[str1.charAt(i) - 'a']++;
		}

		for(int i=0;i<str2.length();i++){
			if(freq[str2.charAt(i) - 'a'] == 0){
				return false;
			}
		}

		return true;
	}

	boolean hashmap(String str1, String str2){	
		
		if(str1.length() != str2.length()){
			return false;
		}

		HashMap<Character,Integer>hm=new HashMap<>();

		for(int i=0;i<str1.length();i++){		//put str1 in hashmap and reduce by str2
			hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i),0)+1);
		}

		for(int i=0;i<str1.length();i++){

			char ch=str2.charAt(i);

			if(!hm.containsKey(ch)){
				return false;
			}

			int count=hm.get(ch);

			if(count == 1){
				hm.remove(ch);
			}else{
				hm.put(ch, count-1);
			}
		}

		return hm.isEmpty();				//empty then return false not then true
	}
}


/*	Q11. Check If Two Strings Are Anagrams
Same characters with same frequency
Example:
String str1 = “heart” , String str2 = “earth”
→ Output: true		*/