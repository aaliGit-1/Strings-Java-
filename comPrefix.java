//Q4: Find largest common prefix in a array of strings
public class comPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]= {"flow","flower","flight"};
       int smallLen=arr[0].length();
       String smallWord=arr[0];
       //comparing with each element which word is smallest and its length
       for(int i=1;i<arr.length;i++) {
    	  if(smallLen>arr[i].length()) {
    		  smallLen=arr[i].length();
    	      smallWord=arr[i];
    	  }
       }
       System.out.println("smallWord: "+smallWord);
       //comparing the smallest word with the remaining words in the array
       for(int i=0;i<arr.length;i++) {
    	   String str=arr[i];
    	   System.out.println("str:"+str);
    	   //to find the common prefix
    	   while(smallWord.equals(arr[i].substring(0,smallLen))==false) {
    		  if(smallWord.charAt(0)!=arr[i].charAt(0)) {//if the starting letter is not same
    			  smallWord="No common prefix";
    			  break;
    		  }
    		  //System.out.println("string: "+arr[i]);
    		  //System.out.println("smallLen: "+smallLen);
    		  smallLen--;
    		  System.out.println("smallLen: "+smallLen);
    		  smallWord=smallWord.substring(0,smallLen);
    		  System.out.println("smallWord: "+smallWord);
    	   }
       }
       System.out.println("Longest Common Prefix: "+smallWord);
	}

}
