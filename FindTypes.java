package week2.day1.assignment;

public class FindTypes {


	public static void main(String[] args) {
			// Here is the input
			String test = "$$ Welcome to 2nd Class of Automation $$ ";

			// Here is what the count you need to find
			int  letter = 0, space = 0, num = 0, specialChar = 0;

			// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array*/
				
				char[] ch=test.toCharArray();
				
				int length=ch.length-1;
				char ch1;
			//	b) Traverse through each character (using loop)
				for (int i=0;i<=length;i++)
				{
					/*	c) Find if the given character is what type using (if)
					i)  Character.isLetter */
					
					ch1=ch[i];
					if (Character.isAlphabetic(ch1))
						letter++;
					else if(Character.isDigit(ch1))
					num++;
					else if(Character.isSpace(ch1))
						space++;
					else
						specialChar++;
					     

						
							
				}
				
			
			/*			ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/

			// Print the count here
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);

			
}
}