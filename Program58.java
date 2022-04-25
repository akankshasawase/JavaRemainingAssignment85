import java.util.*;
import java.lang.*;
import java.io.*;
public class Program58
{
	public static void main(String args[])
	{
		String str;
		int length,i;
		char ch;
		Scanner o= new Scanner(System.in);
		System.out.println("Enter a string:");
		str=o.nextLine();
		length=str.length();
		for(i=0;i<length;i++)
		{
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else
			{
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}
}