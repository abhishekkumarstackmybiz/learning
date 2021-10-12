/*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.*/
 
import java.util.Scanner;
public class VowelOrConsonant
{
	
	public void checkVowelOrConsonant(char ch)
	{
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
	
	public static void main(String[] at)
	{
		char ch;
		VowelOrConsonant obj=new VowelOrConsonant();
		
		System.out.println("Enter a Character:-");
		String str=(new Scanner(System.in)).next();
		ch=str.charAt(0);
		
		if(str.length()>1||(ch>122&&ch<97)||(ch<65&&ch>90))
			System.out.println("Wrong Input");
		else
			obj.checkVowelOrConsonant(ch);
		
	}
}