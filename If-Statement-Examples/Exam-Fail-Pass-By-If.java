import java.util.Scanner;

class ExamCheckingByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter math marks : ");
		int math = kb.nextInt();
		System.out.print("Enter Science marks : ");
		int science = kb.nextInt();
		System.out.print("Enter English marks : ");
		int english = kb.nextInt();
		
		if(math>=40 && science>=40 && english>=40)
		{
			System.out.println("Result -> Pass");
		}
		if(!(math>=40 && science>=40 && english>=40))
		{
			System.out.println("Result -> Fail");
		}
	}
}