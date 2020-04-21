package programs;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=3;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=1;k<=3;k++)
		{
			for(int l=3; l>=k;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		int n=5;
		for(int i=1;i<=n; i++)
		{
			
				for (int space=n; space>=i;space--)    
				{
					System.out.print(" ");
					
				}
				for(int space=1;space<=i;space++);
				{
					
				System.out.print("* ");

			}
			System.out.println();
		}

	}

}
