//Striver DSA Sheet
//Q3: Longest odd number in a string
import java.lang.Math;
public class longOdd {
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
        String str="37427";
        int num=0;
        for(int i=str.length()-1,j=0;i>=0;i--,j++) {
        	num+=(Math.pow(10, j)*charToNum(str.charAt(i)));
        }
        System.out.println("Number: "+num);
        if(num%2!=0) {
        	System.out.println("Largest value odd integer: "+num);
        }
        else {
        	int odd=num%10,rem=0;
        	while(num!=0) {
        		rem=num%10;
        		num=num/10;
        		if(rem>odd)
        			odd=rem;
        	}
        	if(odd%2==0)
        		System.out.println("No Largest value odd integer is present.");
        	else
        		System.out.println("Largest value odd integer: "+odd);
        }
	}

}
