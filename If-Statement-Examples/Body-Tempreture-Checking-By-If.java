import java.util.Scanner;

class TempretureByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Your Tempreture in F : ");
		int temp = kb.nextInt();
		
		if(temp>=100)
		{
			System.out.println("Status -> You Have A Fever");
		}
		if(temp<100)
		{
			System.out.println("Status -> You Dont Have A Fever");
		}
	}
}