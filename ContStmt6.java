import java.util.*;
class ContStmt6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=sc.nextInt();
        System.out.println("Enter number b");
		int b=sc.nextInt();
		System.out.println("Enter number c");
		int c=sc.nextInt();
		
		if(a+b==c%10) 
		{
		System.out.println("The sum of " +a+ "and" +b+ " equals the last digit of " +c+ ".");
		}
		else
		{
			System.out.println("The sum of " +a+ "and" +b+ " not equals the last digit of " +c+ ".");
		}
	   
	}
}
