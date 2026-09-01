import java.util.Scanner;

class BankAccountInterest
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter account balance : ");
		int balance = kb.nextInt();
		
		if(balance >= 50000)
		{
			if(balance>=100000)
			{
				System.out.println("Interest Earned : "+balance*0.06);
			}
			else
			{
				System.out.println("Interest Earned : "+balance*0.05);
			}
		}
		else
		{
			if(balance>=10000)
			{
				System.out.println("Interest Earned : "+balance*0.04);
			}
			else
			{
				System.out.println("Interest Earned : "+balance*0.03);
			}
		}
	}
}