import java.util.*;
class ContStmt14

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		char ch= sc.next().charAt(0);
		String res=(ch>='A' && ch<='Z') ? (ch+ " is a uppercase letter") : (ch+ "is not an uppercase letter");
		System.out.println(res);
        


	 

	}
}