import java.util.Scanner;
class Array9
{
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
		
		System.out.println("Factorial of the each number in the array:");
		for(int i=0;i<n;i++)
		{
			int num=arr[i];
			long fact=1;
			
			for(int j=1;j<=num;j++)
			{
				fact*=j;
			}
			
			System.out.println("Factorial of " +num+ " is " +fact);
		}
		
		
			
	}
}
