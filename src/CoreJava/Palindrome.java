package CoreJava;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word;
Scanner SC=new Scanner(System.in);
System.out.println("Enter the word");
word=SC.nextLine();
StringBuilder word1=new StringBuilder(word);
word1.reverse();
if(word.equals(word1.toString()))
{
	System.out.println("It is a palindrome");
}
else
{
	System.out.println("It is not a palindrome");
}
	}

}
