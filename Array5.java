import java.util.Scanner;
class Array5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements in array:");
		int n=sc.nextInt();
		int[] a=new int[n];
	
		System.out.print("Enter " +n+ " elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
		
			}
		}
		System.out.println("Sum of even numbers in array :" + sum);
		}
				
			
	}
