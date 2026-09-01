import java.util.Scanner;

class AttendanceCheck
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Attendance Percentage : ");
		int attendance = kb.nextInt();
		
		if(attendance>=75)
		{
			System.out.println("Result -> Eligible For Exam");
		}
		else
		{
			System.out.println("Result -> Not Eligible For Exam");
		}
	}
}