import java.util.Scanner;

class DiscountEligibility
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Purchase Amount : ");
		int amount = kb.nextInt();
		
		if(amount>=1000)
		{
			System.out.println("Result -> Discount Applicable");
		}
		else
		{
			System.out.println("Result -> Discount Not Applicable");
		}
	}
}