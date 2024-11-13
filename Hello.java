import java.util.*;
class ContStmt1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		var n=sc.nextInt();
		if(n%3==0) 
		{
		System.out.println("The no is divisible by 3");
		}
		else
		{
			System.out.println("The no is not divisible by 3");
		}
	}
}
