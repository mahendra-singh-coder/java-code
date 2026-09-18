class Duplicate
{
	public static void main(String []args)
	{
		int num[]=new int[]{1,1,2,2,3,3};
		int i,j;
		for(i=0,j=i+1;j<num.length;j++)
		{
			if(num[j]!=num[i])
			{
				i++;
				num[i]=num[j];
			}
		}
		System.out.print(i+1);
	}
}