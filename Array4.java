import java.util.Scanner;
class Array4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements in array:");
		int n=sc.nextInt();
		int[] a=new int[n];
	
		System.out.println("Enter " +n+ " elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp=a[0];
		a[0]=a[n-1];
		a[n-1]=temp;
		System.out.println("Array elements after swapping first and last elements");
		for(int i=0;i<n;i++)
		{
			
				System.out.println(a[i] + " ");
		}
		}
				
			
	}
