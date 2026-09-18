class RemoveElement
{
	public static void main(String []args)
	{
		int num[]=new int[]{0,1,2,2,3,4,2,6,2};
		int val=2;
		int k=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=val)
			{
				num[k]=num[i];
				k++;
			}
		}
		System.out.print(k);
	}
}