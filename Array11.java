//Display first even number in the given array
import java.util.Scanner;
class Array11
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
		
		boolean foundEven= false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0) {
				System.out.println("First even number in the array is:" +arr[i]);
				break;
		}
		}
		if(!foundEven) 
		{
			System.out.println("Even number not found");
		}
			
	}
}
