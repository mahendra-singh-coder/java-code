import java.util.Scanner;

class PasswordByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String password = kb.next();
		
		if(password.length()>=8)
		{
			System.out.println("Status -> Strong Password");
		}
		if(password.length()<8)
		{
			System.out.println("Status -> Weak Password");
		}
	}
}