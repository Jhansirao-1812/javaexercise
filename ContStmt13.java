import java.util.*;
class ContStmt13

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		char ch= sc.next().charAt(0);
        
	
        if (ch =='a' || ch=='e' ||ch=='i'||ch == 'o' || ch=='u' || ch =='A' || ch=='E' ||ch=='I'||ch == 'O' || ch=='U')
        {
			System.out.println(ch + " is  vowel");
        }
		else
		{
			System.out.println(ch + " is not a vowel");
		}

	   
	}
}