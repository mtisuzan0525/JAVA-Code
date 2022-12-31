package firstClassProject;

public class Summation {
	public static int LoopWhile()
	{
		int now=100,sum=0;
		while(now>0)
		{
			sum+=now;
			now--;
		}
		return sum;
	}
	public static int LoopFor()
	{
		int sum=0;
		for(int i=1 ; i<=100 ; i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static int LoopDoWhile()
	{
		int sum=0,now=1;
		do {
			sum+=now;
			now++;
		}
		while(now<=100);
		return sum;
	}
	public static void main(String arg[])
	{
		System.out.println("Summation of 1 to 100 using While loop : "+LoopWhile());
		System.out.println("Summation of 1 to 100 using For loop : "+LoopFor());
		System.out.println("Summation of 1 to 100 using do While loop : "+LoopDoWhile());
		
		return;
	}
}
