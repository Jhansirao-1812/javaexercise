import java.util.Scanner;
class Array8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements in array:");
		int n=sc.nextInt();
		
		if(n<=0)
		{
			System.out.println("Array size must be greater than zero");
		}
		
		int[] a=new int[n];
		System.out.println("Enter " +n+ " elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 
		for (int i=0;i<n;i++ )	
		{
			int num=a[i];
			System.out.println("Multiplication table for "+num+ ":");
			for(int j=1;j<=10;j++)
			{
				System.out.println(num+"x"+j+"="+(num*j));
			}
			System.out.println();
		}
			
	}
}
