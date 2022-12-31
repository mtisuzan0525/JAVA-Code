package firstClassProject;
import java.util.Scanner;

public class BloodDonation {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		sc.close();
		if(age>=18 && age<=75) //Age lower limit :18 //Age upper limit: 75
		{
			if(weight>=50)
			{
				System.out.println("Yes, you are fit for Blood donation.");
			}
			else
			{
				System.out.println("Sorry, not fit for donation.");
			}
		}
		else 
		{
			System.out.println("Sorry, not fit for donation.");
		}
	}
}
