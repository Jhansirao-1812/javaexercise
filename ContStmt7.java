import java.util.*;
class ContStmt7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
        
		
		if(quantity %12 == 0) 
		{
		System.out.println("The quantity given is exactly in dozens");
		}
		else
		{
			System.out.println("The quantity given is not exactly in dozens");
		}
	   
	}
}
