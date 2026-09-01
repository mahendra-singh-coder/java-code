import java.util.Scanner;

class LuggageWeight
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Luggage Weight (in KG) : ");
		int weight = kb.nextInt();
		
		if(weight>20)
		{
			System.out.println("Result -> OverWeight! Extra charge  may apply");
		}
		else
		{
			System.out.println("Result -> Luggage Weight is in Limit");
		}
	}
}