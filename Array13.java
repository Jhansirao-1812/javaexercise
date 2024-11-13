//Display last odd number in the given array
import java.util.Scanner;
class Array13
{
	public static int findFirstEven(int[] arr) 
	{
		for(int num: arr)
		{
			if(num%2==0)
			{
				return num;
			}
			
		}
		return -1;
	}
	public static int findLastOdd(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2!=0)
				{
				return arr[i];
			}
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements");
			for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int firstEven=findFirstEven(arr);
		int lastOdd=findLastOdd(arr);
		
		if(firstEven!=-1 && lastOdd!= -1) 
		{
			int sum=firstEven+lastOdd;
			System.out.println("Sum of first even number and last odd number:" +sum);
		}
		else
		{
			System.out.println("Could not find both an even number and an odd number");
		}
		
		
			
	}
}
