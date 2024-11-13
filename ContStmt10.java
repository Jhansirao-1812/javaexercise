import java.util.*;
class ContStmt10

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int num=sc.nextInt();
        
		
		if(num%3==0 && num%5 ==0) 
		{
		System.out.println(num+ " is divisble by both 3 and 5 ");
		}
		else
		{
			System.out.println(num + " is not divisble by both 3 and 5 ");
		}
	   
	}
}