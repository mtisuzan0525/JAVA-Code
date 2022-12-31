package firstClassProject;
import java.util.Scanner;

public class Grading {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int var=sc.nextInt();
		sc.close();
		if((var>=80 && var<=100))
		{
			System.out.println("You got A+!");
		}
		else if((var>=70 && var<=79))
		{
			System.out.println("You got A!");
		}
		else if((var>=60 && var<=69))
		{
			System.out.println("You got A-.");
		}
		else if((var>=0 && var<=59))
		{
			System.out.println("Ohh, you got F.");
		}
		else
		{
			System.out.println("Invalid marking.");
		}
	}
}
