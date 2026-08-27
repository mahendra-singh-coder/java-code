import java.util.Scanner;

class LeapYearByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = kb.nextInt();
		
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Result -> LeapYear");
		}
		if(!(year%4==0 || year%400==0 && year%100!=0))
		{
			System.out.println("Result -> Not a LeapYear");
		}
	}
}