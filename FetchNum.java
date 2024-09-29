//Q7:Fetching only numbers from the given ticket number 
public class FetchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="4523EF58G";
        String str2="";
        for(int i=0;i<str1.length();) {
        	if((str1.charAt(i)=='E'&&str1.charAt(i+1)=='F')) {
        		i+=2;
        	}
        	else if(str1.charAt(i)=='G') {
        		i++;
        	}
        	else {
        		System.out.println("str2:"+str2);
        		str2+=str1.charAt(i);
        		i++;
        	}
        }
        System.out.println("Output: "+str2);
	}

}
