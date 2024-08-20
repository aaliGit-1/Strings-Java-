//Striver DSA Sheet
//Q7: Check if two strings are anagrams or not
//Anagrams: a word or phrase formed by rearranging the letters of a 
//different word or phrase, typically using all the original letters exactly once
import java.util.Arrays;
public class anagram {
	public static String sortString(String s) {
		s=s.toLowerCase();
		char temArr[]=s.toCharArray();
		/*for(int i=0;i<temArr.length;i++) {//printing the temArr
			System.out.print(temArr[i]+",");
		}
		System.out.println();*/
		Arrays.sort(temArr);
		return new String(temArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abc";
        String t="bca";
        System.out.println("s:"+sortString(s)+" t:"+sortString(t));
        if(sortString(s).equals(sortString(t))){
        	System.out.println("Is two strings are anagrams? True");
        }
        else{
        	System.out.println("Is two strings are anagrams? False");
        }
	}

}
