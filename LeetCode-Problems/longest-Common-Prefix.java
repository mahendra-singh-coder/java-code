class Prefix
{
	public static void main(String []args)
	{
		String strs[]=new String[]{"flower","flow","flight"};
		int max=strs[0].length();
		for(int i=0;i<strs.length;i++)
		{
			if(strs[i].length() < max)
			{
			    max = strs[i].length();
			}
		}
		String common="";
		for(int i=0;i<max;i++)
		{
			boolean equal=true;
			for(int j=0;j<strs.length-1;j++)
			{
				if(strs[0].charAt(i) != strs[j+1].charAt(i))
				{
				    equal = false;
				    break;
				}
			}
			if(equal==true)
			{
				common+=strs[0].charAt(i);
			}
			else{
				break;
			}
		}
		System.out.print(common);
	}
}