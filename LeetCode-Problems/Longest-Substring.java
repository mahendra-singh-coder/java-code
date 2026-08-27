class LongestSubString
{
	public static void main(String []args)
	{
		String sub="";
		String str="abcabcbb";
		String arr[]=str.split("");
		int j;

		for(int i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				
				if(arr[i].equals(arr[j]))
				{
					break;
				}
			}
			if(j>=arr.length)
			{
				sub+=arr[i];
			}
		}
		System.out.println("longest substring without duplicate characters : "+sub);
		System.out.println("length of the longest substring without duplicate characters : "+sub.length());

	}
}