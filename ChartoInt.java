//Convert char to int
import java.util.Scanner;
class ChartoInt 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
	int asciValue=(int)ch;
	System.out.println("The ASCII value of character of " +ch + " is " +asciValue);
		

	}
}
