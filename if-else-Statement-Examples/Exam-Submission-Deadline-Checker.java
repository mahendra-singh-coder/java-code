import java.util.Scanner;

class ExamSubmission
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Sibmission date (DD) : ");
		int submission = kb.nextInt();
		System.out.print("Enter deadline date (DD) : ");
		int deadline = kb.nextInt();
		
		if(submission > deadline)
		{
			System.out.println("Result -> submission Late");
		}
		else
		{
			System.out.println("Result -> submission on Time");
		}
	}
}