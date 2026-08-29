import java.util.Scanner;

class DrivingLicenseEligibility
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = kb.nextInt();
		
		if(age>=18)
		{
			System.out.println("Status -> Eligible For Driving License");
		}
		else
		{
			System.out.println("Status -> Not Eligible For Driving License");
		}
	}
}