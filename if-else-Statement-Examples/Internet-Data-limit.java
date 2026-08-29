import java.util.Scanner;

class DataLimit
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter data used (GB) : ");
		double data = kb.nextDouble();
		
		if(data>=2)
		{
			System.out.println("Result -> Data Limit Exceeded");
		}
		else
		{
			System.out.println("Result -> Data Limit Not Exceeded");
		}
	}
}