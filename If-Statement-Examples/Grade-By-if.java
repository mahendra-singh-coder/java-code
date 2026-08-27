import java.util.Scanner;

class Grade
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a marks : ");
		int marks = kb.nextInt();
		
		if(marks>=90)
			System.out.print("Grade -> A");
		if(marks>=75 && marks<90)
			System.out.print("Grade -> B");
		if(marks>=50 && marks<75)
			System.out.print("Grade -> C");
		if(marks<50)
			System.out.print("Grade -> Fail");
	}
}