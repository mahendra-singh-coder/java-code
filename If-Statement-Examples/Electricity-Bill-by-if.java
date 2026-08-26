import java.util.Scanner;

class billByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Electricity Units Consumed : ");
		int unit = kb.nextInt();

		if(unit>500)
		{
			System.out.println("Bill : "+(unit*5)*1.20);
		}
		if(unit>300 && unit<=500)
		{
			System.out.println("Bill : "+(unit*5)*1.10);
		}
		if(unit<=300)
		{
			System.out.println("Bill : "+(unit*5));
		}
	}
}