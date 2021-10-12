//Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.Scanner;
import java.math.BigDecimal;

public class SameOrNot
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Floating Point Number:-");
		BigDecimal number1=new BigDecimal(sc.next());
		System.out.println("Enter Second Floating Point Number:-");
		BigDecimal number2=new BigDecimal(sc.next());
		
		System.out.println((number1.setScale(3,BigDecimal.ROUND_DOWN)).compareTo(number2.setScale(3,BigDecimal.ROUND_DOWN))==0?"Same":"Not Same");
	}
}