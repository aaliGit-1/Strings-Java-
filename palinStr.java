//Striver DSA Sheet (StringsMedium)
//Q6: Longest Palindromic String
public class palinStr {
	public static boolean checkRev(String s) {
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i)+"";
		}
		if(temp.equals(s))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="mammal",tem=s;//babad, cbbd
        //method1
        /*for(int m=0,n=s.length()-1;m<n;m++,n--) {
        	//System.out.println("m:"+m+"n:"+n);
        	if(s.charAt(m)!=s.charAt(n)) {
        		tem=s.substring(m+1,n);
        		//System.out.println("s:"+tem);
        	}
        	else//if we get the palindromic string
        		break;//come out of the loop
        }*/
        //mehod 2 //aaliya: this method works for every palindromic string
        for(int m=0;m<s.length()-1;m++) {
        	for(int n=m+1;n<s.length();n++) {
        		//System.out.println("m:"+m+"n:"+n);
        		//tem=s.substring(m,n+1);
        		//System.out.println("temp:"+tem);
        		if(s.charAt(m)==s.charAt(n)) {
        			tem=s.substring(m,n+1);
            		break;//it is only out of the for loop of n not for of m
            	}
        	}
        	if(checkRev(tem))
    			break;
        }
        if(checkRev(tem)==false)
        	System.out.println("Longest Palindromic Substring doesn't exist.");
        else
        	System.out.println("Longest Palindromic Substring: "+tem);
	}

}
