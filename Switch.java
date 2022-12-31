package firstClassProject;
import java.util.Scanner;
import java.io.File;

public class Switch {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		switch(num) 
		{
		case 10:
			System.out.println("The number is ten.");
			break;
		case 20:
			System.out.println("The number is twenty.");
			break;
		case 30:
			System.out.println("The number is thirty.");
			break;
		case 40:
			System.out.println("The number is fourty.");
			break;
		default:
			System.out.println("Out of bound.");
		}
	}
}
