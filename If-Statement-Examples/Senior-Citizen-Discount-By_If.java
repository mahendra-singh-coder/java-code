import java.util.Scanner;

class SeniorCitizenByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = kb.nextInt();
		System.out.print("Enter Your Bill Amount : ");
		int amount = kb.nextInt();
		
		if(age>=60)
		{
			double bill = amount*0.10;
			System.out.println("Discounted Bill amount : "+(amount-bill));
		}
		if(age<60)
		{
			System.out.println("Bill amount : "+amount);
		}
	}
}