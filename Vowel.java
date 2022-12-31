package firstClassProject;
import java.util.Scanner;

public class Vowel {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		char ch='A';
		switch(ch)
		{
		case 'a','e','i','o','u':
			System.out.println("'"+ch+"' is a lowercase vowel of English alphabet.");
			break;
		case 'A','E','I','O','U':
			System.out.println("'"+ch+"' is a uppwercase vowel of English alphabet.");
			break;
		default:
			System.out.println("'"+ch+"' is a consonant of English alphabet.");
		}
		return;
	}
}
