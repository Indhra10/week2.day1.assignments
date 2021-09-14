package week2.day1.assignment;
import java.util.Arrays;
import java.lang.reflect.Array;


public class AnagramExample {
	public static void main(String[] args) {
	String S="potss";
	String Z="stods";
	
	
    char[] arr1= S.toCharArray();
    char[] arr2= Z.toCharArray();
    boolean bool=true;
    
    
     int length1= arr1.length -1;
     int length2=arr2.length -1;
     
     if (length1==length2)
     {
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	String S1=String.copyValueOf(arr1);
	String S2=String.copyValueOf(arr2);
	   if (S1.equals(S2))
	     {
		   System.out.println("this is anagram");
	     }
	   else
		   System.out.println("this is not anagram");
	     }
	
			/*
			 * for (int i=0;i<length1;i++) { for (int j=0;j<length2;j++)
			 * 
			 * 
			 * { if(arr1[i]!=arr2[j])
			 * 
			 * bool=false;
			 * 
			 * } }
			 * 
			 * 
			 * if (bool==true) System.out.println("It is anagram"); else
			 * 
			 * System.out.println("It is not anagram"); }
			 */
    
	else
    	 System.out.println("The length is not equal, so it is not a anagram");
	 
	}
	
}
