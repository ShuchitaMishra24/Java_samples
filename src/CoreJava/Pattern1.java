package CoreJava;

public class Pattern1 {

	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j<=3;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=x;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			x=x+2;
		}
		int y=5;
		for(int i=1;i<=7;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=y;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			y=y-2;
		}
	}

}
