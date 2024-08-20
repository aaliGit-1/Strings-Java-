//Striver DSA Sheet (StringsMedium)
//Q4:String to 32-bit signed integer
public class strToInt {
	public static int charToNum(char c) {
		int n=0;
		switch(c) {
		case '0':
			n=0;
			break;
		case '1':
			n=1;
			break;
		case '2':
			n=2;
			break;
		case '3':
	        n=3;
	        break;
		case '4':
			n=4;
			break;
		case '5':
			n=5;
			break;
		case '6':
			n=6;
			break;
		case '7':
			n=7;
			break;
		case '8':
			n=8;
			break;
		case '9':
			n=9;
			break;
		default:
			n=-1;
			break;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=" -12",copystr="";//making copy of s for negative no.
        int num=0;
        s=s.toLowerCase();//for strings containing words
        for(int i=0;i<s.length()-1;i++) {
        	if(s.charAt(0)==' '||(s.charAt(0)=='0'&&charToNum(s.charAt(1))!=-1)) {
        		s=s.substring(1,s.length());
        	}
        	else if(s.charAt(0)=='-') {
        		copystr=s;
        		s=s.substring(1,s.length());
        	}
        	else if(charToNum(s.charAt(i))!=-1&&charToNum(s.charAt(i+1))==-1){
            	s=s.substring(0,i+1);//it is for s="99-1" output=99
            }
        	
        }
        if((s.charAt(0)>=97&&s.charAt(0)<123)||s.charAt(0)=='0'&&charToNum(s.charAt(1))==-1) {
    		num=0;
    	}
        else {
        	for(int i=s.length()-1,j=0;i>=0;i--,j++) {
            	num+=(Math.pow(10, j)*charToNum(s.charAt(i)));
            }
        }
        if(copystr!="") {
        	System.out.println("Number: "+(-num));
        }
        else {
        	System.out.println("Num: "+num);
        }
        
	}

}
