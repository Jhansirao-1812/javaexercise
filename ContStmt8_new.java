import java.util.*;
class ContStmt8_new

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int age=sc.nextInt();
        
		
		if(age >= 18) 
		{
		System.out.println("The person is eligible for vote");
		}
		else
		{
			System.out.println("The person is not eligible for vote");
		}
	   
	}
}