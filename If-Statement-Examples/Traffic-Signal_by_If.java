import java.util.Scanner;

class SignalByIf
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter Signal (1=red , 2=yellow , 3=green) : ");
		int signal = kb.nextInt();
		
		if(signal==1)
			System.out.print("Status -> Stop");
		if(signal==2)
			System.out.print("Status -> Get Ready");
		if(signal==3)
			System.out.print("Status -> Go");
	}
}