import java.util.*;
class ContStmt5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number m1");
		int m1=sc.nextInt();
        System.out.println("Enter number m2");
		int m2=sc.nextInt();
		System.out.println("Enter number m3");
		int m3=sc.nextInt();
		System.out.println("Enter number m4");
		int m4=sc.nextInt();
		if((m1+m2+m3+m4)/4>=60) 
		{
		System.out.println("The average of 4 subjects marks greater than 60");
		}
		else
		{
			System.out.println("The average of 4 subjects marks is not greater than 60 ");
		}
	   
	}
}
