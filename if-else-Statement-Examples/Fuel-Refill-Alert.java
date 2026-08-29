import java.util.Scanner;

class FuelRefill
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Fuel Level (Liter) : ");
		int fuel = kb.nextInt();
		
		if(fuel<5)
		{
			System.out.println("Result -> Refill Needed");
		}
		else
		{
			System.out.println("Result -> Refill Not Needed");
		}
	}
}