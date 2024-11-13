//Convert int to char
import java.util.Scanner;
class InttoChar 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter integer:");
		int a=sc.nextInt();
		char ch=(char)a;
	
	System.out.println("The character corresponding to integer" +a + " is " +ch);
		

	}
}
