import java.util.*;
class ContStmt17

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();

		String res=(a==b || b==c || c==a) ? "Atleast two numbers are equal" : "No two numbers are equal";
		System.out.println(res);


	 

	}
}