import java.util.Scanner;

class AtmCashByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Account Balance : ");
		int bal = kb.nextInt();
		System.out.print("Enter Withdrawal Amount : ");
		int withd = kb.nextInt();

		if(withd<=bal && withd % 100 == 0)
		{
			System.out.println("Withdrawal -> Succesful");
		}
		if(!(withd<=bal && withd % 100 == 0))
		{
			System.out.println("Withdrawal -> UnSuccesful");
		}
	}
}