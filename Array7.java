import java.util.Scanner;
class Array7
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
		 int largest=a[0];
		
		for(int i=1;i<n;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("The largest number in array is: " +largest);
			
	}
}
