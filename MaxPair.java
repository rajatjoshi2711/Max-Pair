class MaxPair
{
	public static void main(String[] args)
	{
		int arr[] = {1,8,5,3,7,10,3};
		MaxAddPair(arr);
	}
	
	static void MaxAddPair(int[] arr)
	{
		int pair[] = new int[6];
		
		for(int i=0;i<6;i++)
		{
			pair[i] = arr[i] + arr[i+1];
		}
		
		int index = FindMax(pair);
		System.out.println("Pair with maximum addition is "+index+"-"+(index+1)+".");
	}
	
	static int FindMax(int[] arr)
	{
		int max = arr[0];
		int index = 0;
		
		for(int i=1;i<6;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
				index = i;
			}
		}
		
		return index;
	}
}