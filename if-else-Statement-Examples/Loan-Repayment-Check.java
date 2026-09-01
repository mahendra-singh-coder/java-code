import java.util.Scanner;

class LoanRepaymentCheck
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Loan Amount : ");
		int loan = kb.nextInt();

		if(loan==0)
		{
			System.out.println("No Pending Dues");
		}
		else
		{
			System.out.println("Pending Loan To Be paid");
		}
	}
}