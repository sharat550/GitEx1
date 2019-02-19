import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int testVariable;
		
		//Scan for input
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("Vaishnav's Changes");
			System.out.println("Sharath's Changes");
			
		}
		for(int j=n-1;j>=1;j--)
		{
			for(int k=1;k<=j;k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	        System.out.println("Line added for pull req");		
		}
	}

}
