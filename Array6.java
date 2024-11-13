import java.util.Scanner;
class Array6
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
		int[] oddnum=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				oddnum[count]=a[i];
				count++;
		
			}
		}
		System.out.println("Odd numbers in reverse order:");
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(oddnum[i]+ "");
		}
				
			
	}
}
