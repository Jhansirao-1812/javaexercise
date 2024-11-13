import java.util.*;
class ContStmt11

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int n=sc.nextInt();
        
		
		

		String res= (n>=30 && n<=50) ? n + " is between 30 and 50" : n+ " is not between 30 and 50";
		System.out.println(res);
	   
	}
}