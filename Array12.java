//Display last odd number in the given array
import java.util.Scanner;
class Array12
{
	public static int findLastOdd(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]%2!=0) {
				return arr[i];
			}}
			return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int result=findLastOdd(arr);
		if(result!=-1)
		{
			System.out.println("Last odd number:" +result);
		}
		else
		{
			System.out.println("No odd number found");
		}
			
	}
}
