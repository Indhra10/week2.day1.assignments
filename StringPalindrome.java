package week2.day1.assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String S="apple";
		String Z="";
		
		char ch;
		int j=0;
		char stArr[]=S.toCharArray();
	
		
		System.out.println(stArr);
		for(int i=stArr.length -1;i>=0;i--)
		{
			 ch=stArr[i];
	//		System.out.print(ch)
		Z=String.valueOf(ch);
		
		System.out.print(Z);
				
		
		}
		if(S.equals(Z))
		{
			System.out.println("it is a palindrome");
		}
		else
			System.out.println("it is not a palindrome");
    
}
	
}
