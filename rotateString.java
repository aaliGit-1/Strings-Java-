//Striver DSA Sheet
//Q6: two strings s and t return true iff s==t when left shift of s can 
//become t (left shift: leftmost char of s is shifted to rightmost char)
public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abcde";
        String t="cdeab";
        String newS="";
        boolean out=false;
        for(int i=0;i<s.length();i++) {
        	newS=s.substring(i+1,s.length())+s.substring(0,i+1);
        	if(newS.equals(t)) {
        		out=true;
        		break;
        	}
        }
        System.out.println("Is "+t+" can be made to by shifting "+s+" ? "+out);
	}

}
