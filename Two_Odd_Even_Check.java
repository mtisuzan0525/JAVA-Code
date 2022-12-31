package firstClassProject;
import java.util.Scanner;

public class Two_Odd_Even_Check {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		if(x%2 == 1)
		{
			System.out.println(x+" is a Odd number.");
		}
		else
		{
			System.out.println(x+" is a Even number.");
		}
	}
}
