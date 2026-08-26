import java.util.Scanner;

class BankLoanByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = kb.nextInt();
		System.out.print("Enter Your Salary : ");
		int salary = kb.nextInt();
		
		if(age>=21 && salary>=25000)
		{
			System.out.println("Loan Status -> Eligible");
		}
		if(age<21 && salary<25000)
		{
			System.out.println("Loan Status -> Not Eligible");
		}
	}
}