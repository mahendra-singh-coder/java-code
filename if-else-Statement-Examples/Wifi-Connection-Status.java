import java.util.Scanner;

class Connection
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Are you connected to WIFI (0=no , 1=yes) : ");
		int status = kb.nextInt();
		
		if(status==0)
		{
			System.out.println("Result -> No Internet Connection");
		}
		else
		{
			System.out.println("Result -> You Connected To WIFI");
		}
	}
}