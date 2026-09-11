import java.util.Scanner;
class TwoSum
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner (System.in);
		int arr[]=new int[5];
		System.out.print("Enter 5 values : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=kb.nextInt();
		}
		System.out.print("Enter target : ");
		int target=kb.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.print("["+ i+" , "+j+" ]");
				}
			}
		}
	}
}