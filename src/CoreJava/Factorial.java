package CoreJava;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,fact=1;
Scanner SC=new Scanner(System.in);
System.out.println("Enter a number");
n=SC.nextInt();
for(int i=n;i>=1;i--)
{
	fact=fact*i;
}
System.out.println("Factorial of a number "+n+" is "+fact);
	}

}
