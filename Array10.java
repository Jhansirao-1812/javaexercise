//Program to display prime numbers in the array
import java.util.Scanner;
class Array10
{
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
		
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
		
		System.out.println("Prime numbers in the array:");
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
		}
		}
		
			
	}
}
