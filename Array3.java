import java.util.Scanner;
class Array3 
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
		System.out.println("Even numbers in array:");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] + " ");
			}
		}
		}
				
			
	}
