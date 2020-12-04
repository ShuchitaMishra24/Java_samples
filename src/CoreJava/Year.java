package CoreJava;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long y;
float p=500;
Scanner SC=new Scanner(System.in);
System.out.println("Enter the year");
y=SC.nextLong();
for(int i=1;i<=10;i++)
{
	p=p*2;
	System.out.println("Money in "+y+" is=Rs "+p);
	y++;
}
	}

}
