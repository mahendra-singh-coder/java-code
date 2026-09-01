import java.util.Scanner;

class RechargeValidity
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter recharge Amount : ");
		int amount = kb.nextInt();
		
		if(amount>=100)
		{
			System.out.println("Result -> Validity Extends");
		}
		else
		{
			System.out.println("Result -> Validity not Extends");
		}
	}
}