//find minimum distance between two words
import java.util.Scanner;
public class minDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inp[]={"geeks","for","geeks","contribute","practise"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word1: ");
        String w1=sc.nextLine();
        System.out.println("Enter word2: ");
        String w2=sc.nextLine();
        int ind1=0,ind2=-1,minD=-1,ind1test=0;
        //to find the words in the array
        for(int i=0;i<inp.length;i++) {
        	if(w1.equals(inp[i])) {//if word1 is in array
        		ind1=i;//save word1 index
        		ind1test=1;//this is only to test if w1 is present or not
        		System.out.println("ind1: "+ind1);
        	}
        	if(w2.equals(inp[i])) {//if word2 is in array
        		ind2=i;	//save word2 index
        		System.out.println("ind2: "+ind2);
        		break;
        	}		
        }
        minD=ind2-ind1;
        if(minD>=0&&ind1test==1)//both words are in the array
        	System.out.println("Minimum distance: "+minD);
        else//if any one or both words are not in the array
        	System.out.println("No minimum distance as one of the word is out of the array or both words are out of the array.");
	}

}
