import java.util.*;
class ContStmt18

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

		String res=(a!=b && b!=c && c!=a) ? "All three numbers are unique" : "The numbers are not unique";
		System.out.println(res);


	 

	}
}