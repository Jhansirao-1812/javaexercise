import java.util.Scanner;
class Array2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n=sc.nextInt();
		int[] a=new int[n];
	
		System.out.println("Enter " +n+ " elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
			System.out.println("Sum of array elements " +sum);
			
			
	}
}
